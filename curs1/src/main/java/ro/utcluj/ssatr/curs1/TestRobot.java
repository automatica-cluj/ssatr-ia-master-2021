/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.ssatr.curs1;

public class TestRobot {
    public static void main(String[] args) {
        Robot r1 = new Robot(1, "ABC");
        Robot r2 = new Robot(0, "XYZ");
        
        for(int i=0;i<2;i++)
            r1.deplasareStanga();
        
        r2.deplsareDreapta();
        
        
        Robot r3 = new Robot("PQR");
        r3.deplsareDreapta();
        
        Robot r4 = null;
        
        System.out.println(r1);
        System.out.println(r2);
        
        
        r4 = r3;
        r4.deplasareStanga();
        System.out.println(".....");
        System.out.println(r3);
        System.out.println(r4);
                
        System.out.println(".............");
        r1 = r2;
        r1.deplasareStanga();
        
                
        
        
        
    }
}
