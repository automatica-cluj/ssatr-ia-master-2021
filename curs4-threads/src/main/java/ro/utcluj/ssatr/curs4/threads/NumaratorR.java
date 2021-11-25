package ro.utcluj.ssatr.curs4.threads;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumaratorR implements Runnable{

private int counter;
    private boolean active;

     
    public void run() {
        
        active = true;
        while (active) {
            counter++;
            System.out.println(Thread.currentThread().getName()+" Counter=" + counter);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Numarator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
