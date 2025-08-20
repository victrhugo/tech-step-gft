public class RareWordDecoder {

    // metodo que verifica se existe sequência de 3 letras consecutivas
    public static String checkSequence(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 2; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i + 1);
            char following = word.charAt(i + 2);

            if (next == current + 1 && following == current + 2) {
                return "" + current + next + following;
            }
        }
        return null;
    }
}