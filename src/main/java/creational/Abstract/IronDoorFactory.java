package creational.Abstract;
// Iron door factory to get iron door and the relevant fitting expert
public class IronDoorFactory implements DoorFactory{
    public Door makeDoor(){
        return new IronDoor();

    }
    public DoorFittingExpert makeFittingExpert(){
        return new Welder();
    }
}
