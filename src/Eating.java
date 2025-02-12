public interface Eating<FoodType, digestType> {

    void eat(FoodType food);

    digestType digest();
}

