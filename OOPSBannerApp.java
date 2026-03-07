public class OOPSBannerApp {

    static class CharacterPattern {
        private char character;
        private String[] lines;

        public CharacterPattern(char character, String[] lines) {
            this.character = character;
            this.lines = lines;
        }

        public String getLine(int index) {
            return lines[index];
        }
    }

    public static void main(String[] args) {
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            " **** ", "* *", "* *", "* *", "* *", "* *", " **** "
        });
        CharacterPattern charP = new CharacterPattern('P', new String[]{
            "***** ", "* *", "* *", "***** ", "* ", "* ", "* "
        });
        CharacterPattern charS = new CharacterPattern('S', new String[]{
            " **** ", "* ", "* ", " **** ", "    * ", "    * ", " **** "
        });

        CharacterPattern[] word = {charO, charO, charP, charS};

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (CharacterPattern cp : word) {
                sb.append(cp.getLine(i)).append("  ");
            }
            System.out.println(sb.toString());
        }
    }
}
