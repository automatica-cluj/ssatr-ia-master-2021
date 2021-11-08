package ro.utcluj.ssatr.curs2.parking;

import java.util.*;

public class ParkingAccessManager2 {
   
    //colectie care poate sotca un numar nelimita de masini 
   private ArrayList<Car> list = new ArrayList<>(); 
    
   public void enterCar(Car c){
       list.add(c);
   }

    void exitCar(String plateNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAllCarsAsString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
