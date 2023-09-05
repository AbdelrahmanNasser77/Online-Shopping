public class Menu {

    private static int price;
    private static String quality = "";
    private static String name;
    public static void main() {
        System.out.println(Design.centerText + "Main Menu");
        System.out.println("[1] " + "Food");
        System.out.println("[2] " + "Clothes");
        System.out.println("[3] " + "Home Appliances");
        System.out.println("[4] " + "Electronics");
    }
    public static void food() {
        System.out.println(Design.centerText + Design.purpleText("Food") );

        System.out.printf("%-20s%-1s%n", "\tName", "Price");
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    name = " Rice";
                    price = 30;
                    break;
                case 2:
                    name = " Pasta";
                    price = 25;
                    break;
                case 3:
                    name = " Milk";
                    price = 20;
                    break;
                case 4:
                    name = " Meat";
                    price = 250;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", name, price);
        }
    }

    public static void clothes() {
        System.out.println(Design.centerText + Design.purpleText("Clothes"));

        System.out.printf("%-20s%-1s%n", "\tName", "Price");
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    name = " T-shirt";
                    price = 150;
                    break;
                case 2:
                    name = " Pants";
                    price = 200;
                    break;
                case 3:
                    name = " Shoes";
                    price = 250;
                    break;
                case 4:
                    name = " Jackets";
                    price = 100;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", name, price);
        }
    }

    public static void homeAppliances() {
        System.out.println(Design.centerText + Design.purpleText("Home Appliances"));
        System.out.println("[1] " + "Cookers");
        System.out.println("[2] " + "Washing Machines");
        System.out.println("[3] " + "Fridges");
        System.out.println("[4] " + "TVs");
    }
    public static void electronics() {
        System.out.println(Design.centerText + Design.purpleText("Electronics"));
        System.out.println("[1] " + "Laptop");
        System.out.println("[2] " + "SmartPhone");
        System.out.println("[3] " + "Camera");
        System.out.println("[4] " + "Gaming Console");
    }
    public static void qualityListCookers() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 40000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 25000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 10000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListWashingMachines() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 17500;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 15000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 10000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListFridges() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 85000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 30000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 10000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }
    public static void qualityListTVs() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 20000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 10000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 5000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListLaptop() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 60000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 30000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 10000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListSmartPhone() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {

            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 45000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 15000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 6000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListCamera() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 50000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 25000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 10000;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

    public static void qualityListGamingConsole() {
        System.out.printf("%-20s%-1s%n", "\tQuality", "Price");
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    quality = " High-End";
                    price = 25000;
                    break;
                case 2:
                    quality = " Mid-Range";
                    price = 10000;
                    break;
                case 3:
                    quality = " Low-Budget";
                    price = 3500;
                    break;
            }
            System.out.print("[");
            System.out.print(i);
            System.out.print("]");
            System.out.printf("%-20s%-1s%n", quality, price);
        }
    }

}
