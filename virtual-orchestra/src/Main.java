import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Orchestra orchestra = new Orchestra();
        final Scanner sc = new Scanner(System.in);

        System.out.println("=== Orquestra Virtual ===");
        System.out.println("Escolha instrumentos para a apresentação.");
        System.out.println("Digite os números desejados e finalize com 0.");
        System.out.println("1) Violino  |  2) Piano  |  3) Tambor  |  0) Finalizar seleção");

        while (true) {
            System.out.print("Opção: ");
            int option;
            try {
                option = sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Entrada inválida. Digite números (0, 1, 2, 3).");
                sc.next(); // descarta entrada inválida
                continue;
            }

            if (option == 0) break;

            InstrumentFactory.fromOption(option).ifPresentOrElse(
                    orchestra::add,
                    () -> System.out.println("Opção inexistente. Tente novamente.")
            );
        }

        System.out.println("\nInstrumentos na orquestra: " + orchestra.getLineup());
        orchestra.perform();
    }
}
