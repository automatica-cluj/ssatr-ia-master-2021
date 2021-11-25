/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.ssatr.curs4.threads.timer;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mihai.hulea
 */
public class Timer extends Thread{
    private long counter;
    private boolean active;
    private TimerJFrame frame;
    private boolean paused;
    private Integer X = new Integer(10);

    public Timer(TimerJFrame frame) {
        this.frame = frame;
    }    
    
    public void run(){
        active = true;
        while(active){
            counter++;
            frame.updateTimer(counter);
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(paused){
                synchronized(X){
                    try {
                        X.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }//.synch
            }//.if
        }//.while
    }//.run
    
    public void setPaused(){
        paused = true;
    }
    
    public void setResumed(){
        synchronized(X){
            paused=false;
            X.notify();
        }
    }
    
    
}
