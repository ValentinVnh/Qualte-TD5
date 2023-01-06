package Model;

import java.util.*;


public class VoitureMoteurDiesel extends VoitureMontee {


    public VoitureMoteurDiesel(Voiture voiture) {
        super(voiture);
    }

    public float getAcceleration() {
       return 130;
    }

    public float getFreinage() {
        return 70;
    }

    public float getMasse() {
        return 300;
    }

    public float getPrix() {
        return 12999;
    }

    @Override
    public String toString() {
        return "Moteur : Diesel" + super.toString();
    }
}