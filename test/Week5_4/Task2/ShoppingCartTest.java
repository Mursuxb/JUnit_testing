package Week5_4.Task2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);

        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertEquals(2, cart.getItemCount());
        cart.addItem("Orange", 0.75);
        cart.addItem("Milk", 2.0);
        assertEquals(4, cart.getItemCount());
        cart.removeItem("Banana");

        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testCalculateTotal() {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Apple", 1.0);
        cart.addItem("Banana", 0.5);
        assertEquals(1.5, cart.calculateTotal(), 0.01);
        cart.addItem("Orange", 0.75);
        assertEquals(2.25, cart.calculateTotal(), 0.01);
        cart.addItem("Milk", 2.0);
        assertEquals(4.25, cart.calculateTotal(), 0.01);
    }
}