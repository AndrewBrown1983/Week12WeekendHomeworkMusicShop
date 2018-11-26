import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("Fender", "brown", InstrumentType.STRING, 100, 140, 6);
    }

    @Test
    public void canPlay() {
        assertEquals("strum strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(40, guitar.calculateMarkUp(), 0.01);
    }
}
