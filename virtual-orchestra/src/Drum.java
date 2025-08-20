public class Drum implements Instrument {

    @Override
    public String getDisplayName() {
        return "Tambor";
    }

    @Override
    public void play() {
        System.out.println("Tambor:  tum tum tum ");
    }
}
