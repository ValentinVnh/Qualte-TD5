package Model;

public class Main {
    public static void main(String[] args) {


        Voiture vme = new VoitureMoteurEssence(new VoitureFreinsFoucault(new Chassis()));


        Voiture vmd = (new VoitureFreinsDisque(new VoitureMoteurDiesel(new Chassis())));
        Voiture vmdSF = new VoitureMoteurDiesel(new Chassis());
        Voiture vmi = (new VoitureMoteurEssence(new VoitureMoteurDiesel(new Chassis())));



        System.out.println(vme);
        System.out.println("\n");
        System.out.println(vmd);
        System.out.println("\n");
        System.out.println(vmdSF);
        System.out.println("\n");
        System.out.println(vmi);
    }
}
