public class Insekt extends Tier {
    
    int anzahlFluegel;

    public Insekt(String name, int groesse, int anzahlFluegel){
        super(name, groesse);
        setAnzahlFluegel(anzahlFluegel);
    }
    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " + getAnzahlFluegel());    
    }
    public void setAnzahlFluegel(int anzahlFluegel) {
        this.anzahlFluegel = anzahlFluegel;
    }
    public int getAnzahlFluegel() {
        return anzahlFluegel;
    }
}
