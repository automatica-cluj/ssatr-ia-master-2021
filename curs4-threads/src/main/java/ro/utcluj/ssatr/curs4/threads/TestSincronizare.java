/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.utcluj.ssatr.curs4.threads;

public class TestSincronizare {
public static void main(String[] args) {
    Punct p = new Punct();
    FirSet fs1 = new FirSet(p);
    FirGet fg1 = new FirGet(p);
 
    fs1.start();
    fg1.start();
}
}
 
class FirGet extends Thread {
    Punct p;
 
    public FirGet(Punct p){
        this.p = p;
    }
 
    public void run(){
        int i=0;
        int a,b;
        while(++i<100000){         
           synchronized(p){//<----------------------------
            a= p.getX();          
            try {
                sleep(50);
            } catch (InterruptedException e) {  
                e.printStackTrace();
            }         
            b = p.getY();
            }//.end syncrhonized
            System.out.println("Am citit: ["+a+","+b+"]");
        }
    }
}//.class
 
 
class FirSet extends Thread {
    Punct p;
    public FirSet(Punct p){
        this.p = p;
    } 
    public void run(){
        int i =0;
        while(++i<100000){
            int a = (int)Math.round(10*Math.random()+10);
            int b = (int)Math.round(10*Math.random()+10);
 
            synchronized(p){
                p.setXY(a, b);

                System.out.println("Am scris: [" + a + "," + b + "]");
                try {
                    sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }//.end syncrhonized
        }
    }
}//.class
 
class Punct {
    int x,y;
    public void setXY(int a,int b){
        x = a;y = b;
    }  
    public int getX(){return x;}
    public int getY(){return y;}   
}