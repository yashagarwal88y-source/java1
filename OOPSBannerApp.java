import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            " **** ", "* *", "* *", "* *", "* *", "* *", " **** "
        });
        patternMap.put('P', new String[]{
            "***** ", "* *", "* *", "***** ", "* ", "* ", "* "
        });
        patternMap.put('S', new String[]{
            " **** ", "* ", "* ", " **** ", "     *", "     *", " **** "
        });

        char[] word = {'O', 'O', 'P', 'S'};

        for (int i = 0; i < 7; i++) {
            StringBuilder sb = new StringBuilder();
            for (char c : word) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[i]).append("  ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
