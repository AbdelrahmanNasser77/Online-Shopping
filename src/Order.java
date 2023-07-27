public class Order {
    private double eachItemPrice;
    private double quantity;
    private double totalItemPrice;
    private Message message;


    public Order() {
        eachItemPrice = 0;
        totalItemPrice = 0;
        quantity = 0;
    }


    public void setMessage(Message message) {
        this.message = message;
    }


    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setEachItemPrice(double eachItemPrice) {
        this.eachItemPrice = eachItemPrice;
    }
    public double getEachItemPrice() {
        return eachItemPrice;
    }


    public double getTotalItemPrice() {totalItemPrice =  getQuantity() * getEachItemPrice();return totalItemPrice;}

    public String toString() {
        return
                Design.redText + getEachItemPrice() + Design.resetColorText  + " EGP/" + message.printQuantityType() +
                        " , " + Design.greenText + getQuantity() + Design.resetColorText + " " + message.printQuantityType() +
                        " , " + Design.redText +  getTotalItemPrice() + Design.resetColorText + " EGP";
    }
}