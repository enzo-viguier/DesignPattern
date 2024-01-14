package behavioral.state;

public class Brouillon implements Etat {

    private Document document;

    public Brouillon(Document document) {
        this.document = document;
    }

    @Override
    public void rendu() {
        System.out.println("[BROUILLON] Rendu du document");
    }

    @Override
    public void publier() {
        System.out.println("[BROUILLON] Publication du document");
        document.setEtat(new Moderation(document));
    }

}
