import Instruments.Guitar;
import Instruments.InstrumentType;
import OtherItems.OtherItem;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar guitar;
    OtherItem otherItem;
    Shop shop;

    @Before
    public void setUp() throws Exception {
        otherItem = new OtherItem("Drum Sticks", 15, 21.99);
        guitar = new Guitar("Fender", "brown", InstrumentType.STRING, 100, 140, 6);
        shop = new Shop("Music Shop", "1234 Great Western Road");
    }

    @Test
    public void canGetNumberOfItemsInStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddToStock() {
        shop.addItem(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(guitar);
        shop.addItem(otherItem);
        shop.removeItem(otherItem);
        assertEquals(1, shop.countStock());
        assertEquals(true, shop.checkForItem(guitar));
        assertEquals(false, shop.checkForItem(otherItem));
    }

    @Test
    public void canCalculateShopProfitPotential() {
        shop.addItem(guitar);
        shop.addItem(otherItem);
        assertEquals(46.99, shop.calculateProfit(), 0.01);
    }
}
