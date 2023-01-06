package Model;

import java.util.*;

public abstract class VoitureMontee implements Voiture {

    public Voiture wrapper;

    public VoitureMontee(Voiture voiture) {
        super();
        wrapper = voiture;
    }

    @Override
    public String toString() {
        return "\nAcceleration : " + getAcceleration() + "\nFreinage : " + getFreinage() + "\nMasse : " + getMasse() + "\nPrix : " + getPrix();
    }
}