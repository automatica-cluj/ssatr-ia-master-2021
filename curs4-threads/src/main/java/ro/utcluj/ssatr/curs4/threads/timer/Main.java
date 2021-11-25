/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.ssatr.curs4.threads.timer;

/**
 *
 * @author mihai.hulea
 */
public class Main {
    public static void main(String[] args) {
        TimerJFrame f1= new TimerJFrame();
        f1.setVisible(true);
        Timer t1 = new Timer(f1);
        f1.setTimer(t1);
        t1.start();
        
        TimerJFrame f2= new TimerJFrame();
        f2.setVisible(true);
        Timer t2 = new Timer(f2);
        f2.setTimer(t2);
        t2.start();
        
         TimerJFrame f3= new TimerJFrame();
        f3.setVisible(true);
        Timer t3 = new Timer(f3);
        f3.setTimer(t3);
        t3.start();
        
         TimerJFrame f4= new TimerJFrame();
        f4.setVisible(true);
        Timer t4 = new Timer(f4);
        f4.setTimer(t4);
        t4.start();
        
    }
  
}
