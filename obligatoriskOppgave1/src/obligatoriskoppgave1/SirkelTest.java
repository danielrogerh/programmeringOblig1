package obligatoriskoppgave1;

import static javax.swing.JOptionPane.*;

class Sirkel {

    private double radius;
    private double diameter;
    private double omkrets;
    private double areal;
    
    public Sirkel(double radius) {
        this.radius = radius;
        if(radius < 0){
        radius = 0;
        }
        this.diameter = radius * 2;
        this.omkrets = diameter * Math.PI;
        this.areal = Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public double getOmkrets() {
        return omkrets;
    }
    public void setOmkrets(double omkrets) {
        this.omkrets = omkrets;
    }
    public double getAreal() {
        return areal;
    }
    public void setAreal(double areal) {
        this.areal = areal;
    }
    
    public void utskrift(){
       String ut = "Diameteren er: " + String.format("%.2f", diameter) + "\n" +
                    "Omkretsen er: " + String.format("%.2f", omkrets) + "\n" +
                    "Arealet er: " + String.format("%.2f", areal);
        if (radius > 0){      
        showMessageDialog(null, ut);
        }
        else{
        showMessageDialog(null, "Radius må være større enn 0");
            } 
    }

}

public class SirkelTest {
    public static void main(String[] args) {
        double innRadius1 = Double.parseDouble(showInputDialog("Skriv inn radius:"));
        Sirkel sirkelObjekt1 = new Sirkel (innRadius1);
        sirkelObjekt1.utskrift(); 
        double innRadius2 = Double.parseDouble(showInputDialog("Skriv inn radius:"));
        Sirkel sirkelObjekt2 = new Sirkel (innRadius2);
        sirkelObjekt2.utskrift();    
        double innRadius3 = Double.parseDouble(showInputDialog("Skriv inn radius:"));
        Sirkel sirkelObjekt3 = new Sirkel (innRadius3);  
        sirkelObjekt3.utskrift(); 
        double snitt = (innRadius1 + innRadius2 + innRadius3) / 3;
        if(innRadius1 < 0){
            showMessageDialog(null, "Du har skrevet inn noe feil"); 
        }
        else if(innRadius2 < 0){
            showMessageDialog(null, "Du har skrevet inn noe feil");
        }
        else if (innRadius3 <0){
            showMessageDialog(null, "Du har skrevet inn noe feil");
        }
        else{
        showMessageDialog(null, "Den gjennomsnittlige radiusen er: " + String.format("%.2f", snitt));
        }
    }  
}