package Week5_4.Task2;

public class ShoppingCart {
    private int itemCount = 0;
    private double totalPrice = 0;
    private Item[] items = new Item[100];

    public void addItem(String name, double price) {
        items[itemCount] = new Item(name, price);
        itemCount++;
        totalPrice += price;
    }

    public void removeItem(String name) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getName().equals(name)) {
                totalPrice -= items[i].getPrice();
                items[i] = items[itemCount - 1];
                itemCount--;
                break;
            }
        }
    }

    public double calculateTotal() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}
