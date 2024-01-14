package behavioral.state;

public class Document implements Etat {

    private Etat etat;

    public Document() {
        this.etat = new Brouillon(this);
    }

    @Override
    public void rendu() {
        this.etat.rendu();
    }

    @Override
    public void publier() {
        this.etat.publier();
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

}
