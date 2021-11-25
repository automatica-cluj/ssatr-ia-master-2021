package ro.utcluj.ssatr.curs4.threads;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Numarator extends Thread {

    private int counter;
    private boolean active;

    public Numarator(String name) {
        setName(name);
    }
    
    public void run() {
        active = true;
        while (active) {
            counter++;
            System.out.println(getName()+" Counter=" + counter);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Numarator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void stopNumarator(){
        active = false;
    }
    
    public static void main(String[] args) {
        Numarator n1 = new Numarator("Primul fir");
        n1.start();
        Numarator n2 = new Numarator("Al doilea fir");
        n2.start();
        
        NumaratorR n3 = new NumaratorR();
        Thread tn3 = new Thread(n3);
        tn3.setDaemon(true);
        tn3.start();
        
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(Numarator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        n1.stopNumarator();
        n2.stopNumarator();
        
    }

}
