package Model;

public class VoitureFreinsFoucault extends VoitureMontee{

    public VoitureFreinsFoucault(Voiture voiture) {
        super(voiture);
    }

    @Override
    public float getAcceleration() {
        return wrapper.getAcceleration();
    }

    @Override
    public float getFreinage() {
        return wrapper.getFreinage() + 2000;
    }

    @Override
    public float getMasse() {
        return wrapper.getMasse();
    }

    @Override
    public float getPrix() {
        return wrapper.getPrix() + 200;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFreins : Foucault";
    }
}
