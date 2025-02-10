public class Mwashi extends Animals {

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
}
