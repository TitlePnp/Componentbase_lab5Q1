/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbsd_ex5q1;

import java.util.EventObject;

/**
 *
 * @author tleku
 */
public class ScoreEvent extends EventObject {
    String score;

    public ScoreEvent(Object source, String scr) {
        super(source);
        score = scr;
    }
    
    public String getScore() {
        return score;
    }
    
    
}
