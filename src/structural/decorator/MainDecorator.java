package structural.decorator;

public class MainDecorator {

    public static void main(String[] args) {

        // Voiture GT2006

        Voiture gt = new GT2006();
        System.out.println(gt);

        gt = new GPS(gt);
        System.out.println(gt);

        gt = new Turbo(gt);
        System.out.println(gt);

        // Voiture Twingo

        Voiture twingo = new Twingo();
        System.out.println(twingo);

        twingo = new GPS(twingo);
        System.out.println(twingo);

        twingo = new PorteBagage(twingo);
        System.out.println(twingo);


    }

}
