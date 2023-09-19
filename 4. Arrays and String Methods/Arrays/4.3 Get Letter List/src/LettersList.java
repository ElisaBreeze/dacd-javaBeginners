public class LettersList {
    //code the getLetterList method that accepts a word as argument and returns a list of its letters
    public static String[] getLettersList(String palabra) {

        String[] lista = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {

            lista[i] = palabra.substring(i, i + 1);
        }
        return lista;
    }
}