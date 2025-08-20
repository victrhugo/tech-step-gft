import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// gerencia os instrumentos escolhidos
public class Orchestra {

    private final List<Instrument> instruments = new ArrayList<>();

    // adiciona um instrumento a orquestra
    public void add(Instrument instrument) {
        if (instrument == null) return;
        instruments.add(instrument);
    }

    // retorna a lista de instrumentos (somente leitura)
    public List<Instrument> getInstruments() {
        return Collections.unmodifiableList(instruments);
    }

    //retorna o nome dos instrumentos formatados ja em string para exibicao
    public String getLineup() {
        if (instruments.isEmpty()) return "—";
        return instruments.stream()
                .map(Instrument::getDisplayName)
                .collect(Collectors.joining(", "));
    }

    //executa a apresentacao (toca os instrumentos selecionados)
    public void perform() {
        if (instruments.isEmpty()) {
            System.out.println("Nenhum instrumento selecionado para a apresentação.");
            return;
        }
        instruments.forEach(Instrument::play);
    }
}
