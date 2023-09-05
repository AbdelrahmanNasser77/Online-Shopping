import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\t\t" + "Enter Customer Name --> " + "\t");
        String customerName = in.nextLine();

        Design.cls();

        System.out.print("\t\t" + "Enter How many items will you buy --> " + "\t");
        int itemNum = in.nextInt();
        Design.cls();

        Customer customer = new Customer();
        customer.setNumOfItems(itemNum);

        Item[] items = new Item[Customer.getNumOfItems()];
        Order[] orders = new Order[Customer.getNumOfItems()];

        PricesList pricesList = new PricesList();

        TotalCost totalCost = new TotalCost();
        totalCost.setOrder(orders);

        Message message;

        for (int i = 0; i < Customer.getNumOfItems(); i++) {
            items[i] = new Item();
            orders[i] = new Order();
        }

        for (int i = 0; i < Customer.getNumOfItems(); i++) {

            message = new Message();
            message.setItem(items[i]);

            pricesList.setItems(items[i]);

            Menu.main();

            System.out.print("\t\t" + "Enter NUMBER of Category you want --> " + "\t");
            items[i].setItemType(in.nextInt());
            Design.cls();

            switch (items[i].getItemType()) {
                case 1:
                    Menu.food();
                    break;
                case 2:
                    Menu.clothes();
                    break;
                case 3:
                    Menu.homeAppliances();
                    break;
                case 4:
                    Menu.electronics();
                    break;
            }

            System.out.print("\t\t" + "Enter NUMBER of Product you want --> " + "\t");
            items[i].setItemName(in.nextInt());
            Design.cls();

            System.out.println(Design.centerText + Design.blueText(message.printName()));

            switch (items[i].getItemType())
            {
                case 1:
                case 2:
                    System.out.print("\t\t" + "How Many " + Design.greenText(message.printQuantityType())  + " for " + Design.blueText(message.printName()) + " --> " + "\t");
                    break;
                case 3:
                    switch (items[i].getItemName())
                    {
                        case 1:
                            Menu.qualityListCookers();
                            break;
                        case 2:
                            Menu.qualityListWashingMachines();
                            break;
                        case 3:
                            Menu.qualityListFridges();
                            break;
                        case 4:
                            Menu.qualityListTVs();
                            break;
                    }
                    System.out.print("\t\t" + "What is your Budget" + "-->" + "\t");
                    items[i].setQuality(in.nextInt());
                    System.out.print("\t\t" + "How Many " + Design.greenText(message.printQuantityType()) + " for " + Design.yellowText(message.printQuality()) + " "  + Design.blueText(message.printName()) + " --> " + "\t");
                    break;
                case 4:
                    switch (items[i].getItemName())
                    {
                        case 1:
                            Menu.qualityListLaptop();
                            break;
                        case 2:
                            Menu.qualityListSmartPhone();
                            break;
                        case 3:
                            Menu.qualityListCamera();
                            break;
                        case 4:
                            Menu.qualityListGamingConsole();
                            break;
                    }
                    System.out.print("\t\t" + "What is your Budget" + "-->" + "\t");
                    items[i].setQuality(in.nextInt());
                    System.out.print("\t\t" + "How Many " + Design.greenText(message.printQuantityType()) + " for " + Design.yellowText(message.printQuality()) + " "  + Design.blueText(message.printName()) + " --> " + "\t");
                    break;
            }
            items[i].setMessage(message);

            orders[i].setMessage(message);
            orders[i].setQuantity(in.nextDouble());
            orders[i].setEachItemPrice(pricesList.getPriceItem());

            Design.cls();
        }

        customer.setCustomerName(customerName);
        customer.setItems(items);
        customer.setOrders(orders);
        customer.setTotalPrice(totalCost);
        System.out.println(customer);
    }
}
