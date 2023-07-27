public class Message {
    private String printType;
    private String printName;
    private String printQuality;
    private String printQuantityType;
    private Item item;


    public Message()
    {
        printType = "";
        printName = "";
        printQuality = "";
        printQuantityType = "";
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String printType() {

            switch (item.getItemType()) {
                case 1:
                    printType = "Food";
                    break;
                case 2:
                    printType = "Clothes";
                    break;
                case 3:
                    printType = "Home Appliances";
                    break;
                case 4:
                    printType = "Electronics";
                    break;
            }
        return printType;
    }

    public String printName() {

            switch (item.getItemType()) {
                case 1:
                    switch (item.getItemName()) {
                        case 1:
                            printName = "Rice";
                            break;
                        case 2:
                            printName = "Pasta";
                            break;
                        case 3:
                            printName = "Milk";
                            break;
                        case 4:
                            printName = "Meat";
                            break;
                    }
                    break;
                case 2:
                    switch (item.getItemName()) {
                        case 1:
                            printName = "T-shirt";
                            break;
                        case 2:
                            printName = "Pants";
                            break;
                        case 3:
                            printName = "Shoes";
                            break;
                        case 4:
                            printName = "Jacket";
                            break;
                    }
                    break;
                case 3:
                    switch (item.getItemName()) {
                        case 1:
                            printName = "Cookers";
                            break;
                        case 2:
                            printName = "Washing Machines";
                            break;
                        case 3:
                            printName = "Fridges";
                            break;
                        case 4:
                            printName = "TVs";
                            break;
                    }
                    break;
                case 4:
                    switch (item.getItemName()) {
                        case 1:
                            printName = "Laptop";
                            break;
                        case 2:
                            printName = "SmartPhones";
                            break;
                        case 3:
                            printName = "Camera";
                            break;
                        case 4:
                            printName = "PlayStation";
                            break;
                    }
                    break;
            }
        return printName;
    }

    public String printQuality() {

            if (item.getItemType() == 3 || item.getItemType() == 4) {
                switch (item.getQuality()) {
                    case 1:
                        printQuality = " " + "HIGH-end";
                        break;
                    case 2:
                        printQuality = " " + "Mid-range";
                        break;
                    case 3:
                        printQuality = " " + "Budget";
                        break;
                }
            }
        return printQuality;
    }
    public String printQuantityType() {

            if (item.getItemType() == 1) {
                if (item.getItemName() == 3) {
                    printQuantityType = "Litre";
                } else {
                    printQuantityType = "KG";
                }
            }
            else {
                printQuantityType = "Piece";
            }
        return printQuantityType;
    }

}
