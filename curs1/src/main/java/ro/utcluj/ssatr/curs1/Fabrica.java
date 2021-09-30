/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.ssatr.curs1;

public class Fabrica {
    private Robot[] roboti = new Robot[4];
    
    Fabrica(){
        roboti[0] = new Robot("ABC");
        roboti[1] = new Robot("XYX");
        roboti[3] = new Robot("EFF");
        
    }
    
    public void work(){
        for(int i=0;i<roboti.length;i++){
         if(roboti[i]!=null)
                roboti[i].deplasareStanga();
        }
        
        for(Robot r: roboti)
            if(r!=null) r.deplasareStanga();
    }
    
}
