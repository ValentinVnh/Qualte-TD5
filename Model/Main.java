package Model;

public class Main {
    public static void main(String[] args) {


        Voiture vme = new VoitureMoteurEssence(new Chassis());


        Voiture vmd = new VoitureMoteurDiesel(new Chassis());

        System.out.println(vme);
        System.out.println("\n");
        System.out.println(vmd);
    }
}
