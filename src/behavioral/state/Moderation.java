package behavioral.state;

import java.util.Scanner;

public class Moderation implements Etat {

    private Document document;

    public Moderation(Document document) {
        this.document = document;
    }

    @Override
    public void rendu() {
        System.out.println("[MODERATION] Rendu du document");
    }

    @Override
    public void publier() {

        System.out.println("[MODERATION] Publication du document");

        Scanner scanner = new Scanner(System.in);
        System.out.println("L'utilisateur est administrateur ou auteur ? (y/n)");

        String role = scanner.nextLine();

        if (role.equals("y")) {
            this.document.setEtat(new Publier());
            System.out.println("[MODERATION] Le document est publié et devient [PUBLIE]");
        } else {
            this.document.setEtat(new Brouillon(document));
            System.out.println("[MODERATION] Le document n'est pas accepté par la modération et redevient [BROUILLON]");
        }

    }
}
