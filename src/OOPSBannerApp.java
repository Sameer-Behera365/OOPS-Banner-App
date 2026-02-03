
/**
 * OOPS Banner Application
 * UC6: Refactor Banner Logic into Methods
 *
 * @author Sameer
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + o2[i] + p[i] + s[i]);
        }
    }

    static String[] getOPattern() {
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

    static String[] getPPattern() {
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

    static String[] getSPattern() {
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
}



