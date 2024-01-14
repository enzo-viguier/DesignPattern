package behavioral.state;

public class Publier implements Etat {

    private Document document;

    @Override
    public void rendu() {
        System.out.println("[PUBLIER] Rendu du document");
    }

    @Override
    public void publier() {
        System.out.println("[PUBLIER] Le document est déjà publié");
    }
}
