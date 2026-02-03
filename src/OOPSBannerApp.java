


import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner Application
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Sameer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Builds and returns the character pattern map
     */
    public static Map<Character, String[]> buildCharacterMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "   ***   ",
                "  ** **  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ** **  ",
                "   ***   "
        });

        map.put('P', new String[]{
                "  ****** ",
                "  **    **",
                "  **    **",
                "  **    **",
                "  ****** ",
                "  **     ",
                "  **     ",
                "  **     ",
                "  **     "
        });

        map.put('S', new String[]{
                "  ****** ",
                " **       ",
                " **       ",
                " **       ",
                "  ****** ",
                "       **",
                "       **",
                " **    **",
                "  ****** "
        });

        return map;
    }

    /**
     * Renders a word as a banner
     *
     * @param word the word to display
     * @param map  the character pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int rows = map.get(word.charAt(0)).length;

        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                line.append(map.get(c)[row]);
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterMap();
        renderBanner("OOPS", patternMap);
    }
}
