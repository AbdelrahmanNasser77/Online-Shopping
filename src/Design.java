public class Design {
    public static String centerText = "\t\t\t\t\t\t";

    public static String redText(String s) {
        return "\u001B[31m" + s + "\u001B[0m";
    }
    public static String redText(double s) {
        return "\u001B[31m" + s + "\u001B[0m";
    }
    public static String greenText(String s) {
        return "\u001B[32m" + s + "\u001B[0m";
    }
    public static String greenText(double s) {
        return "\u001B[32m" + s + "\u001B[0m";
    }
    public static String yellowText(String s) {
        return "\u001B[33m" + s + "\u001B[0m";
    }
    public static String yellowText(double s) {
        return "\u001B[33m" + s + "\u001B[0m";
    }
    public static String blueText(String s) {
        return "\u001B[34m" + s + "\u001B[0m";
    }
    public static String blueText(double s) {
        return "\u001B[34m" + s + "\u001B[0m";
    }
    public static String purpleText(String s) {
        return "\u001B[35m" + s + "\u001B[0m";
    }
    public static String purpleText(double s) {
        return "\u001B[35m" + s + "\u001B[0m";
    }

    public static void cls()
    {
        for (int i = 0; i < 19; i++) {
            System.out.println();
        }
    }

}
