package behavioral.state;

public class MainState {

    public static void main(String[] args) {

        Document document = new Document();

        // Brouillon
        document.rendu();
        document.publier();

        // Moderation
        document.rendu();
        document.publier();

        // Si oui : Publication | sinon : Brouillon
        document.rendu();
        document.publier();

        document.rendu();
        document.publier();

        document.rendu();
        document.publier();



    }

}
