public class PricesList {
    private int priceItem;
    private Item items;

    public void setItems(Item items) {
        this.items = items;
    }

    public int getPriceItem() {
        for (int i = 0; i < Customer.getNumOfItems(); i++) {
            switch (items.getItemType())
            {
                case 1:
                    switch (items.getItemName()) {
                        case 1:
                            priceItem = 30;
                            break;
                        case 2:
                            priceItem = 25;
                            break;
                        case 3:
                            priceItem = 28;
                            break;
                        case 4:
                            priceItem = 250;
                            break;
                    }
                    break;
                case 2:

                    switch (items.getItemName())
                    {
                        case 1:
                            priceItem = 150;
                            break;
                        case 2:
                            priceItem = 200;
                            break;
                        case 3:
                            priceItem = 250;
                            break;
                        case 4:
                            priceItem = 180;
                            break;
                    }
                    break;
                case 3:

                    switch (items.getItemName())
                    {

                        case 1:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 40000;
                                    break;
                                case 2:
                                    priceItem = 25000;
                                    break;
                                case 3:
                                    priceItem = 10000;
                                    break;
                            }
                            break;
                        case 2:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 17500;
                                    break;
                                case 2:
                                    priceItem = 15000;
                                    break;
                                case 3:
                                    priceItem = 10000;
                            }
                            break;
                        case 3:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 85000;
                                    break;
                                case 2:
                                    priceItem = 30000;
                                    break;
                                case 3:
                                    priceItem = 10000;
                                    break;
                            }
                            break;
                        case 4:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 20000;
                                    break;
                                case 2:
                                    priceItem = 10000;
                                    break;
                                case 3:
                                    priceItem = 5000;
                                    break;
                            }
                    }
                    break;

                case 4:
                    switch (items.getItemName())
                    {
                        case 1:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 60000;
                                    break;
                                case 2:
                                    priceItem = 30000;
                                    break;
                                case 3:
                                    priceItem = 10000;
                                    break;
                            }
                            break;
                        case 2:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 45000;
                                    break;
                                case 2:
                                    priceItem = 15000;
                                    break;
                                case 3:
                                    priceItem = 6000;
                                    break;
                            }
                            break;
                        case 3:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 50000;
                                    break;
                                case 2:
                                    priceItem = 25000;
                                    break;
                                case 3:
                                    priceItem = 10000;
                                    break;
                            }
                            break;
                        case 4:
                            switch (items.getQuality())
                            {
                                case 1:
                                    priceItem = 25000;
                                    break;
                                case 2:
                                    priceItem = 10000;
                                    break;
                                case 3:
                                    priceItem = 3500;
                                    break;
                            }
                            break;
                }
            }
        }

        return priceItem;
    }
}
