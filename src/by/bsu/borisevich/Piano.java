package by.bsu.borisevich;

public class Piano {
    private String serialNumber;
    private final Key keyA = new Key("A");
    private final Key keyB = new Key("B");
    private final Key keyC = new Key("C");
    private final Key keyD = new Key("D");
    private final Key keyE = new Key("E");
    private final Key keyF = new Key("F");
    private final Key keyG = new Key("G");

    private final Pedal leftPedal = new Pedal("left");
    private final Pedal rightPedal = new Pedal("right");

    public Piano(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void tune(){

    }
}