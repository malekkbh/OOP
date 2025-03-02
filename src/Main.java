//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animals[] zoo = new Animals[10];

        Animals sheep = new Mwashi(2, 2);
        Mwashi cow = new Mwashi(2, 1);
        Moftares lion = new Moftares(6);
        Moftares wolf = new Moftares(4);

        zoo[0] = sheep;
        zoo[1] = cow;
        zoo[2] = lion;
        zoo[3] = wolf;

        for (int i = 0; i < zoo.length; i++) {
            Animals animal = zoo[i];
            if (animal != null) {

                if (animal instanceof Moftares) {
                    ((Moftares) animal).hunt();
                    animal.eat();
                } else {
                    animal.eat();
                }
            }
        }

    }
}