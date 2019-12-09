package creational.Abstract;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door door = woodenDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert = woodenDoorFactory.makeFittingExpert();
        door.getDescription();
        doorFittingExpert.getDescription();

//        Same for iron factory
        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door door1 = ironDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert1 = ironDoorFactory.makeFittingExpert();
        door1.getDescription();
        doorFittingExpert1.getDescription();
    }

}
