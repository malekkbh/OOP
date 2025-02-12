public class Mwashi extends Animals
        implements Eating<Plants , String> {

    private int stomach;

    public Mwashi(int stomach, int age) {
        super(age, "grass", "thadyat");
        this.stomach = stomach;
    }

    public Mwashi() {
        this(2, 1);
    }

    @Override
    public void eat() {
        System.out.println("mwashi eat");
    }

    @Override
    public void speedUp() {
        System.out.println("mwashi speedUp");
    }

    @Override
    public void eat(Plants food) {

    }

    @Override
    public String digest() {
        return "";
    }
}
