public class Moftares extends  Animals
        implements Eating<Mwashi , Double > {

    public Moftares (int age) {
        super(age , "Meat" , "Moftares");
    }

    @Override
    public void eat() {
        System.out.println("Moftares eat");
    }

    @Override
    public void eat(Mwashi food) {

    }

    @Override
    public Double digest() {
        return 0.0;
    }
}
