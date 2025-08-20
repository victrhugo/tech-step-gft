public class Violin implements Instrument {

    @Override
    public String getDisplayName() {
        return "Violino";
    }

    @Override
    public void play() {
        System.out.println("Violino:  fiiiiiiuuu ");
    }
}
