import java.util.ArrayList;

public class App {

    static ArrayList<Tier> tiere;
    public static void main(String[] args) throws Exception {
        setTiere(new ArrayList<Tier>());
        createAnimals();
        zeigeTiereOderDatenIrgendwasSo();
    }

    public static void zeigeTiereOderDatenIrgendwasSo(){
        for(Tier tier : getTiere()){
            tier.werBinIch();
        }
    }

    public static void createAnimals(){
        tiere.add(new Insekt("Wespe", 5, 2));
        tiere.add(new Insekt("Fliege", 3, 2));

        tiere.add(new Raubtier("Milad", 175, "Schwarz"));
        tiere.add(new Raubtier("Lina", 168, "Schwarz"));
        
        tiere.add(new Vogel("Mattis", 173, "Dunkelblond"));
        tiere.add(new Vogel("Daniel", 178, "Blond"));
    }

    public static void setTiere(ArrayList<Tier> tiere) {
        App.tiere = tiere;
    }
    public static ArrayList<Tier> getTiere() {
        return tiere;
    }
}

