package Model;

import java.util.*;


public class VoitureMoteurEssence extends VoitureMontee {


    public VoitureMoteurEssence(Voiture voiture) {
        super(voiture);
    }

    public float getAcceleration() {
        return wrapper.getAcceleration();
    }

    public float getFreinage() {
        return wrapper.getFreinage();
    }

    public float getMasse() {
        return wrapper.getMasse() + 200;
    }

    public float getPrix() {
       return wrapper.getPrix() + 1000;
    }

    @Override
    public String toString() {
        return "Moteur : Essence" + super.toString();
    }
}