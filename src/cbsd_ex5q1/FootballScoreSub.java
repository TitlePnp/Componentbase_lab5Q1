/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbsd_ex5q1;

/**
 *
 * @author tleku
 */
public class FootballScoreSub implements ScoreListener{

    @Override
    public void scoreChange(ScoreEvent evt) {
        System.out.println("(FootBallScore) score is updated : " + evt.getScore());
    }
    
}
