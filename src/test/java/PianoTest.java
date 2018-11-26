import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("Baldwin", "black", InstrumentType.KEYBOARD, 1200, 1699.99, 88);
    }

    @Test
    public void canPlay() {
        assertEquals("ding dong ding", piano.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(499.99, piano.calculateMarkUp(), 0.01);
    }
}
