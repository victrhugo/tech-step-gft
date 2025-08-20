import java.util.Optional;

public final class InstrumentFactory {

    private InstrumentFactory() {}

    public static Optional<Instrument> fromOption(int option) {
        switch (option) {
            case 1: return Optional.of(new Violin());
            case 2: return Optional.of(new Piano());
            case 3: return Optional.of(new Drum());
            default: return Optional.empty();
        }
    }
}
