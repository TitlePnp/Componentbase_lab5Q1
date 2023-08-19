/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cbsd_ex5q1;

import java.util.Scanner;

/**
 *
 * @author tleku
 */
public class CBSD_usingevent_ex5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        LiveScoreSub sub1 = new LiveScoreSub();
        FootballScoreSub sub2 = new FootballScoreSub();
        
        source.addSubscriber(sub1);
        source.addSubscriber(sub2);
        
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Score :");
            String scoreIn = in.nextLine();
            if (scoreIn.equals("")) {
                break;
            }
            else {
                source.setScoreLine(scoreIn);
            }
        }       
    }
    
}
