/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbsd_ex5q1;

import java.util.ArrayList;

/**
 *
 * @author tleku
 */
public class ScoreSource {
       ArrayList<ScoreListener> subscriber;
       
       public ScoreSource() {
           subscriber = new ArrayList<>();
       }
       
       public void addSubscriber(ScoreListener obj) {
           subscriber.add(obj);
       }
       
       public void removeSubscriber(int index) {
           subscriber.remove(index);
       }
       
       public void setScoreLine(String value) {
           fireScoreEvent(new ScoreEvent(this, value));
       }
       
       public void fireScoreEvent(ScoreEvent evt ) {
           for (ScoreListener Subscriber : subscriber) {
               Subscriber.scoreChange(evt);
           }
       }
       
       
}
