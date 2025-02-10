//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//            Animals a = new Animals() ;

        Animals[] zoo = new Animals[10] ;

        Mwashi sheep = new Mwashi(2 , 1);
        sheep.eat();

        Animals cow = new Mwashi(2 , 1) ;
        cow.eat();

        Animals lion = new Moftares(6) ;
        Animals dog = new Moftares(3) ;

        zoo[0] = sheep ;
        zoo[1] = cow ;
        zoo[2] = dog ;
        zoo[3] = lion ;

        System.out.println("******");

        for (int i = 0; i < zoo.length; i++) {
            Animals animal = zoo[i] ;
            if(animal != null) {
                if(animal instanceof Moftares){
                    System.out.println("watch out!! ");
                }
               animal.eat();
            }
        }
    }
}