public class OOPSBannerApp {
    public static void main(String[] args) {
        // Each line is constructed using String.join to avoid '+' operator overhead
        System.out.println(String.join(" ", "", "****", "****", "****", "****", ""));
        System.out.println(String.join(" ", "*", "*", "*", "*", "*", "*", "*"));
        System.out.println(String.join(" ", "*", "*", "*", "*", "*", "*", "*"));
        System.out.println(String.join(" ", "*", "*", "*", "*", "*****", "****", ""));
        System.out.println(String.join(" ", "*", "*", "*", "*", "*", "", ""));
        System.out.println(String.join(" ", "*", "*", "*", "*", "*", "", ""));
        System.out.println(String.join(" ", "", "****", "****", "*", "****", ""));
    }
}
