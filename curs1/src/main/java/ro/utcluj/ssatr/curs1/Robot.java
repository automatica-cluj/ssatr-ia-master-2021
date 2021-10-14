
package ro.utcluj.ssatr.curs1;

public class Robot {
    //atribute
    private int pozitia; 
    private String nume;
    
    //constructori
    public Robot(int pozitia, String nume) {
        this.pozitia = pozitia;
        this.nume = nume;
    }
    
    public Robot(String nume){
        this.nume = nume;
        this.pozitia = 0;
    }
    
    //metode = functie
    void deplasareStanga(){
        pozitia--;
        System.out.println(nume+" Merg la stanga. Noua pozitie "+pozitia);
    }
    
    void deplsareDreapta(){
        pozitia++;
        System.out.println(nume+" Mergi la dreapta. Noua pozitie "+pozitia);
    }
    
    public int getPozitia(){
        return pozitia;
    }
}
