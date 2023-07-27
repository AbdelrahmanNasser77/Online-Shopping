public class Design {
    public static  String resetColorText = "\u001B[0m";
    public static String redText = "\u001B[31m";
    public static String greenText = "\u001B[32m";
    public static String yellowText = "\u001B[33m";
    public static String blueText = "\u001B[34m";
    public static String purpleText = "\u001B[35m";
    public static String centerText = "\t\t\t\t\t\t";

    public static void cls()
    {
        for (int i = 0; i < 19; i++) {
            System.out.println();
        }
    }

}
