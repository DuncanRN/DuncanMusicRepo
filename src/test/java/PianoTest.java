import Products.Instruments.Material;
import Products.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Barratt & Robinson, London",
                145, 80,
                "A piano!",
                Material.MAHOGANY,
                "Brown", 88);
    }

    @Test
    public void hasName(){
        assertEquals("Barratt & Robinson, London", piano.getName());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("ppplIIINNNK", piano.play());
    }
}
