package Model;

import java.util.*;


public class VoitureMoteurEssence extends VoitureMontee {


    public VoitureMoteurEssence(Voiture voiture) {
        super(voiture);
    }

    public float getAcceleration() {
        return 80;
    }

    public float getFreinage() {
        return 30;
    }

    public float getMasse() {
        return 200;
    }

    public float getPrix() {
       return 18999;
    }

    @Override
    public String toString() {
        return "Moteur : Essence" + super.toString();
    }
}