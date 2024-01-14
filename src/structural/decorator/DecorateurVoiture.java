package structural.decorator;

public abstract class DecorateurVoiture extends Voiture {

    protected Voiture voiture;

    public DecorateurVoiture(Voiture voiture) {
        this.voiture = voiture;
        this.nom = voiture.getNom();
        this.prix = voiture.getPrix();
        this.poids = voiture.getPoids();
        this.vitesseMax = voiture.getVitesseMax();
    }

    public abstract String getNom();
    public abstract int getPrix();
    public abstract int getPoids();
    public abstract int getVitesseMax();


}
