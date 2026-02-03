
/**
 * OOPS Banner Application
 * UC7: Store Character Pattern in a Class
 *
 * This version uses an Inner Static Class to store character patterns
 * and uses StringBuilder to render the banner.
 *
 * @author Sameer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class that encapsulates a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         *
         * @param character the character (O, P, S)
         * @param pattern   the ASCII banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern for the character
         *
         * @return String array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get O pattern
     */
    public static String[] getOPattern() {
        return new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        };
    }

    /**
     * Utility method to get P pattern
     */
    public static String[] getPPattern() {
        return new String[]{
                "  ****** ",
                "  **    **",
                "  **    **",
                "  **    **",
                "  ****** ",
                "  **     ",
                "  **     ",
                "  **     ",
                "  **     "
        };
    }

    /**
     * Utility method to get S pattern
     */
    public static String[] getSPattern() {
        return new String[]{
                "  ****** ",
                " **       ",
                " **       ",
                " **       ",
                "  ****** ",
                "       **",
                "       **",
                " **    **",
                "  ****** "
        };
    }

    public static void main(String[] args) {

        // Creating CharacterPatternMap objects
        CharacterPatternMap o = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap p = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap s = new CharacterPatternMap('S', getSPattern());

        // Array of objects representing OOPS
        CharacterPatternMap[] word = {o, o, p, s};

        // Using StringBuilder to render each row
        for (int row = 0; row < o.getPattern().length; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPatternMap cp : word) {
                line.append(cp.getPattern()[row]);
            }
            System.out.println(line);
        }
    }
}

