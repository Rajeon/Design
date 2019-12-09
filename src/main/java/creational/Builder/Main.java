package creational.Builder;

public class Main {
    public static void main(String[] args) {
        Burger burger1 = (new BurgerBuilder(14)).addPepperoni().addLettuce().addTomato().build();
    }
}
