package creational.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Fluffy");
        System.out.println(sheep.getName());
        System.out.println(sheep.getCategory());

//        Clone and modify
        Sheep sheen = sheep.clone();
        sheen.setName("Sheen");
        System.out.println(sheep.getName());
        System.out.println(sheep.getCategory());
    }
}
