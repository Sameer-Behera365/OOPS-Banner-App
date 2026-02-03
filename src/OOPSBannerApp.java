/**
 * OOPS Banner Application
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * @author Sameer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[9];

        banner[0] = String.join("", "   ***   ", "   ***   ", "  ****** ", "  ****** ");
        banner[1] = String.join("", "  ** **  ", "  ** **  ", "  **    **", " **       ");
        banner[2] = String.join("", " **   ** ", " **   ** ", "  **    **", " **       ");
        banner[3] = String.join("", " **   ** ", " **   ** ", "  **    **", " **       ");
        banner[4] = String.join("", " **   ** ", " **   ** ", "  ****** ", "  ****** ");
        banner[5] = String.join("", " **   ** ", " **   ** ", "  **     ", "       **");
        banner[6] = String.join("", " **   ** ", " **   ** ", "  **     ", "       **");
        banner[7] = String.join("", "  ** **  ", "  ** **  ", "  **     ", " **    **");
        banner[8] = String.join("", "   ***   ", "   ***   ", "  **     ", "  ****** ");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
