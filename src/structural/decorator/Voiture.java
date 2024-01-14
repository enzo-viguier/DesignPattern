package structural.decorator;

public abstract class Voiture {

    public String nom;
    public int prix;
    public int poids;
    public int vitesseMax;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String toString() {
        return "------------------------\n"
                + "Voiture : " + getNom() + "\n"
                + "Prix : " + getPrix() + "\n"
                + "Poids : " + getPoids() + "\n"
                + "Vitesse max : " + getVitesseMax() + "\n"
                + "------------------------\n";
    }
}
