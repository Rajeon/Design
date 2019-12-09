package creational.Abstract;
//Fitting experts for each door type
public class Carpenter implements DoorFittingExpert{
    public void getDescription(){
        System.out.println("I can only fit wooden doors");
    }
}
