package structural.decorator;

public class GPS extends DecorateurVoiture {

    public GPS(Voiture v) {
        super(v);
    }

    @Override
    public String getNom() {
        return voiture.getNom() + " GPS";
    }

    @Override
    public int getPrix() {
        return voiture.getPrix() + 150;
    }

    @Override
    public int getPoids() {
        return voiture.getPoids();
    }

    @Override
    public int getVitesseMax() {
        return voiture.getVitesseMax();
    }
}
