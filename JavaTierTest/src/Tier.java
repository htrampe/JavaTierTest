public abstract class Tier {
    
    String name;
    int groesse;

    public Tier(String name, int groesse){
        setGroesse(groesse);
        setName(name);
    }

    public abstract void werBinIch();

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGroesse() {
        return groesse;
    }
    public String getName() {
        return name;
    }

}
