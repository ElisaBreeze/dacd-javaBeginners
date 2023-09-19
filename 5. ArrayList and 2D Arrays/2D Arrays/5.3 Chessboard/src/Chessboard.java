public class Chessboard {
    public static void main(String[] args) {
        char[][] chessboard = new char[8][8];

        /* Create and print a chessboard. */
        int posicion = 1;
        for (int f = 0; f < chessboard.length; f++) {
            for (int c = 0; c < chessboard[0].length; c++) {
                if (posicion % 2 == 0) {
                    chessboard[f][c] = '\u25A0';
                    posicion++;
                } else {
                    chessboard[f][c] = '\u25A1';
                    posicion++;
                }
            }
            posicion++;
        }
        for (char[] fila : chessboard) {
            for (char columna : fila) {
                System.out.print(columna);
            }
            System.out.println();
        }
    }
}