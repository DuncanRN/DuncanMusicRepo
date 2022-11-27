import Products.Accessories.Accessory;
import Products.Instruments.Guitar;
import Products.Instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Jim Dunlop .60mm plectrums", 5, 3, "Jim Dunlop Jd418r60 Tortex Standard .60mm Orange Plectrums Bag of 10");
    }

    @Test
    public void hasName(){
        assertEquals("Jim Dunlop .60mm plectrums", accessory.getName());
    }
}

