public class Raubtier extends Tier {
    
    String fellfarbe;

    public Raubtier(String name, int groesse, String fellfarbe){
        super(name, groesse);
        setFellfarbe(fellfarbe);
    }

    public void werBinIch(){
        System.out.println(getName() + " " + getGroesse() + " " + getFellfarbe());
    }
    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }
    public String getFellfarbe() {
        return fellfarbe;
    }
}
