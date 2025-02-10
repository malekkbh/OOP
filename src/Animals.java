public abstract class Animals {

    private int age;
    private String foodType;
    private String type;

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


}
