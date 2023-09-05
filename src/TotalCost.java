public class TotalCost {
    private double totalCost;
    private Order[] order;
    public TotalCost() {
        totalCost = 0;
    }
    public void setOrder(Order[] order) {
        this.order = order;
    }

    public double getTotalCost() {
        for (int i = 0; i < order.length; i++) {
            totalCost += order[i].getTotalItemPrice();
        }
        return totalCost;
    }
    public String toString() {
        return
                "Total Cost = " + Design.redText(getTotalCost())  + " EGP";
    }
}
