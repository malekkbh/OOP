public class Moftares extends Animals {

    public Moftares(int age) {
        super(age, "Meat", "Moftares");
    }

    public void hunt () {
        System.out.println("catch you!!");
    }

    @Override
    public void eat() {
        System.out.println("Moftares eat");
    }


}
