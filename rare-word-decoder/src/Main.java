import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma palavra:");
            String word = scanner.nextLine();

            String result = RareWordDecoder.checkSequence(word);

            if (result != null) {
                System.out.println("Palavra Rara: contém sequência alfabética: \"" + result + "\"");
            } else {
                System.out.println("Palavra comum: não contém sequência alfabética.");
            }
        }
    }
}