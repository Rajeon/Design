package creational.Builder;

public class Burger {
    protected int size;
    protected boolean cheese = false;
    protected boolean pepperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public Burger(BurgerBuilder ray) {
        this.size = ray.size;
        this.cheese = ray.cheese;
        this.pepperoni = ray.pepperoni;
        this.lettuce = ray.lettuce;
        this.tomato = ray.tomato;
    }
}
