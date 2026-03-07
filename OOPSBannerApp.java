public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ", 
                getLetterO(i), 
                getLetterO(i), 
                getLetterP(i), 
                getLetterS(i)
            );
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static String getLetterO(int row) {
        String[] patterns = {
            " **** ", "* *", "* *", "* *", "* *", "* *", " **** "
        };
        return patterns[row];
    }

    public static String getLetterP(int row) {
        String[] patterns = {
            "***** ", "* *", "* *", "***** ", "* ", "* ", "* "
        };
        return patterns[row];
    }

    public static String getLetterS(int row) {
        String[] patterns = {
            " **** ", "* ", "* ", " **** ", "     *", "     *", " **** "
        };
        return patterns[row];
    }
}
