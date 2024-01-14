package structural.decorator;

public class PorteBagage extends DecorateurVoiture {

    public PorteBagage(Voiture v) {
        super(v);
    }

    @Override
    public String getNom() {
        return voiture.getNom() + " Porte Bagage";
    }

    @Override
    public int getPrix() {
        return voiture.getPrix() + 1000;
    }

    @Override
    public int getPoids() {
        return voiture.getPoids() + 15;
    }

    @Override
    public int getVitesseMax() {
        return voiture.getVitesseMax() - 10;
    }

}
