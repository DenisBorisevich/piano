package by.bsu.borisevich;

public class Pedal implements isPressed{
    private String pedalSide;

    public Pedal(String pedalSide) {
        this.pedalSide = pedalSide;
    }

    public void pushPedal(){
        System.out.println("You've pushed" + pedalSide +" pedal");
    }
}
