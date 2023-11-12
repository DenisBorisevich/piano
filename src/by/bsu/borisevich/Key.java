package by.bsu.borisevich;

public class Key {
    private String keyNote;

    public Key(String keyNote) {
        this.keyNote = keyNote;
    }

    // in fact, this is actually our setter
    public void tune(String keyNote) {
        this.keyNote = keyNote;

    }
    public String getKeyNote() {
        return keyNote;
    }

    public void playNote(){
        System.out.println("You've pressed the key and note " + keyNote + " played");
    }
}
