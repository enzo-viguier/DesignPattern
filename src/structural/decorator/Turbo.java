package structural.decorator;

public class Turbo extends DecorateurVoiture {

    public Turbo(Voiture v) {
        super(v);
    }

    @Override
    public String getNom() {
        return voiture.getNom() + " Turbo";
    }

    @Override
    public int getPrix() {
        return voiture.getPrix() + 4000;
    }

    @Override
    public int getPoids() {
        return voiture.getPoids() + 50;
    }

    @Override
    public int getVitesseMax() {
        return voiture.getVitesseMax() + 80;
    }

}
