package Model;

import java.util.*;


public class VoitureMoteurDiesel extends VoitureMontee {


    public VoitureMoteurDiesel(Voiture voiture) {
        super(voiture);
    }

    public float getAcceleration() {
       return wrapper.getAcceleration();
    }

    public float getFreinage() {
        return wrapper.getFreinage();
    }

    public float getMasse() {
        return wrapper.getMasse() + 300;
    }

    public float getPrix() {
        return wrapper.getPrix() + 200;
    }

    @Override
    public String toString() {
        return "Moteur : Diesel" + super.toString();
    }
}