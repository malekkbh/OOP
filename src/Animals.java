public abstract class Animals implements Moves {

    protected int age;
    protected String foodType;
    protected String type;

    public Animals(int age, String foodType, String type) {
        this.age = age;
        this.foodType = foodType;
        this.type = type;
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void breathOut() {
        System.out.println("Animal breathOut");
    }

    public void breathIn() {
        System.out.println("Animal breathIn");
    }

    @Override
    public void speedUp() {
        System.out.println("Animals speedUp");
    }

    @Override
    public void slowDown() {
        System.out.println("Animals slowDown");
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
