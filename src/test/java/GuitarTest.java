import Products.Instruments.Guitar;
import Products.Instruments.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("J Mascis signature jazzmaster purple sparkle 2007",
                450, 300,
                "Here is a clean and all original pre-owned circa 2007 Fender J Mascis Jazzmaster in original purple sparkle finish! Plays and sounds as great as she looks!",
                Material.MAPLE,
                "Purple Sparkle", 6);
    }

    @Test
    public void hasName(){
        assertEquals("J Mascis signature jazzmaster purple sparkle 2007", guitar.getName());
    }


    @Test
    public void hasBuyingPrice(){
        assertEquals(300, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(450, guitar.getSellingPrice());
    }

    @Test
    public void hasMaterial(){
        assertEquals(Material.MAPLE, guitar.getMaterial());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(150, guitar.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("Kerrang!", guitar.play());
    }
}
