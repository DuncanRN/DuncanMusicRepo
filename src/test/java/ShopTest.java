import Products.Instruments.Guitar;
import Products.Instruments.Material;
import Products.Instruments.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    Piano piano;

    @Before
    public void before(){
        shop = new Shop("Duncan's Music Exchange");
        guitar = new Guitar("J Mascis signature jazzmaster purple sparkle 2007",
                450, 300,
                "Here is a clean and all original pre-owned circa 2007 Fender J Mascis Jazzmaster in original purple sparkle finish! Plays and sounds as great as she looks!",
                Material.MAPLE,
                "Purple Sparkle", 6);
        piano = new Piano("Barratt & Robinson, London",
                145, 80,
                "A piano!",
                Material.MAHOGANY,
                "Brown", 88);
    }

    @Test
    public void hasName(){
        assertEquals("Duncan's Music Exchange", shop.getName());
    }

    // get stock check - should be 0 to start with
    @Test
    public void canGetStockQuantity(){
        assertEquals(0, shop.getStockQuantity());
    }

    // add stock and check stock count has gone up.
    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockQuantity());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStockQuantity());
    }

    @Test
    public void canGetTotalPotentialProfit()
    {
        shop.addToStock(guitar);
        shop.addToStock(piano);
        assertEquals(215, shop.getTotalPotentialProfits());
    }
}
