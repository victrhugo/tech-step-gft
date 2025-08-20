public class Piano implements Instrument {

    @Override
    public String getDisplayName() {
        return "Piano";
    }

    @Override
    public void play() {
        System.out.println("Piano:  plim plim plim ");
    }
}
