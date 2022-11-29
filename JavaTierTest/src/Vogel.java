public class Vogel extends Tier {

    String federfarbe;

    public Vogel(String name, int groesse, String federfaString){
        super(name, groesse);
        setFederfarbe(federfaString);
    }

    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " + getFederfarbe());
    }
    public void setFederfarbe(String federfarbe) {
        this.federfarbe = federfarbe;
    }
    public String getFederfarbe() {
        return federfarbe;
    }
}