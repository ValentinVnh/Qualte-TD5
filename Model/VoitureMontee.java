package Model;

import java.util.*;

public abstract class VoitureMontee implements Voiture {

    private final Voiture wrapper;

    public VoitureMontee(Voiture voiture) {
        super();
        wrapper = voiture;
    }

    public float getAcceleration() {
        return  wrapper.getAcceleration();
    }

    public float getFreinage() {
        return wrapper.getFreinage();
    }

    public float getMasse() {
        return wrapper.getMasse();
    }

    public float getPrix() {
        return wrapper.getPrix();
    }

    @Override
    public String toString() {
        return "\nAcceleration : " + getAcceleration() + "\nFreinage : " + getFreinage() + "\nMasse : " + getMasse() + "\nPrix : " + getPrix();
    }
}