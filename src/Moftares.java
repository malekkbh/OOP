public class Moftares extends Animals
        implements Eating<Mwashi, Double>, Comparable<Moftares> {

    public Moftares(int age) {
        super(age, "Meat", "Moftares");
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

    @Override
    public int compareTo(Moftares other) {
        if (age > other.age) {
            return 1;
        }

        if (age < other.age) {
            return -1;
        }

        return 0;
    }
}
