public class Item {
    private int itemType;
    private int itemName;
    private int quality;

    private Message message;

    public Item() {
        itemType = 0;
        itemName = 0;
        quality = 0;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    public void setItemType(int itemType) {this.itemType = itemType;}
    public int getItemType() {
        return itemType;
    }
    public void setItemName(int itemName) {
        this.itemName = itemName;
    }
    public int getItemName() {
        return itemName;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
    public int getQuality() {
        return quality;
    }



    public String toString()

    {
        return
                Design.purpleText(message.printType())  +
                        " , " + Design.blueText(message.printName()) +
                        Design.yellowText(message.printQuality()) ;
    }
}