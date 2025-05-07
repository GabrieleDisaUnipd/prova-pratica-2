////////////////////////////////////////////////////////////////////
// [Gabriele] [Disa] [2075545]
// [Tommaso] [Tombacco] [2076447]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        int height = 6;
    
        for (int row = 0; row < height; row++) {
            for (char letter : romanNumber.toCharArray()) {
                RomanLetter romanLetter = RomanLetter.valueOf(String.valueOf(letter));
                Character[][] matrix = romanLetter.getMatrix();
    
                for (Character c : matrix[row]) {
                    result.append(c);
                }
                
                result.append(' ');
            }
            result.append('\n');
        }
    
        return result.toString();
    }

    public enum RomanLetter {
        I(RomanLetters.I),
        V(RomanLetters.V);

        private final Character[][] matrix;

        RomanLetter(Character[][] matrix) {
            this.matrix = matrix;
        }

        public Character[][] getMatrix() {
            return matrix;
        }
    }

    // Classe di supporto per contenere le matrici
    public static class RomanLetters {
        public static final Character[][] I = {
            {' ', '_', '_', '_', '_', '_', ' '},
            {'|', '_', ' ', ' ', ' ', '_', '|'},
            {' ', ' ', '|', ' ', '|', ' ', ' '},
            {' ', ' ', '|', ' ', '|', ' ', ' '},
            {' ', '_', '|', ' ', '|', '_', ' '},
            {'|', '_', '_', '_', '_', '_', '|'}
        };

        public static final Character[][] V = {
            {'_','_',' ',' ',' ',' ',' ',' ','_','_'},
            {'\\',' ','\\',' ',' ',' ',' ','/',' ','/'},
            {' ','\\',' ','\\',' ',' ','/',' ','/',' '},
            {' ',' ','\\',' ','\\','/',' ','/',' ',' '},
            {' ',' ',' ','\\',' ',' ','/',' ',' ',' '},
            {' ',' ',' ',' ','\\','/',' ',' ',' ',' '}
        };
    }
}