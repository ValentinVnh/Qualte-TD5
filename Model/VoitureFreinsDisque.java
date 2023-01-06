package Model;

public class VoitureFreinsDisque extends VoitureMontee {



    public VoitureFreinsDisque(Voiture voiture) {
        super(voiture);
    }

    public float getAcceleration() {
        return wrapper.getAcceleration();
    }

    public float getFreinage() {
        return wrapper.getFreinage() + 900;
    }

    public float getMasse() {
        return wrapper.getMasse();
    }

    public float getPrix() {
        return wrapper.getPrix() + 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFreins : Disque";
    }
}
