package by.bsu.borisevich;

public class Piano {
    private String serialNumber;
    private Key key1 = new Key("A");
    private Key key2 = new Key("B");
    private Key key3 = new Key("C");
    private Key key4 = new Key("D");
    private Key key5 = new Key("E");
    private Key key6 = new Key("F");
    private Key key7 = new Key("G");

    private Pedal leftPedal = new Pedal("left");
    private Pedal rightPedal = new Pedal("right");

    public Piano(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void playThePiano(Key...keys){
        for (Key key: keys){
            key.playNote();
        }
    }

}