public class Customer {
    private  String customerName;
    private  static int numOfItems;
    private Order[] orders;
    private Item[] items;
    private TotalCost totalCost;

    public Customer() {
        customerName = "";
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
    public void setTotalPrice(TotalCost totalCost) {
        this.totalCost = totalCost;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setNumOfItems(int numOfItems) {
        Customer.numOfItems = numOfItems;
    }

    public static int getNumOfItems() {
        return numOfItems;
    }

    public String toString() {
        System.out.println(Design.centerText + "CustomerName : " + getCustomerName());
        System.out.println(Design.centerText + "Number of Items: " + getNumOfItems());
        System.out.println();

        for (int i = 0; i < getNumOfItems(); i++) {
            System.out.println
                (
                    "Item = [" + items[i] + "]" +
                    "\n" +
                     "Order = [" + orders[i] + "]" +
                    "\n"
                );
        }
        System.out.print(totalCost);
        return "";
    }
}
