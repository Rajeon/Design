package creational.simpleFactory;
//Make the door and return it
public class DoorFactory {
    public static WoodenDoor makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}