import OtherItems.OtherItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherItemTest {
    OtherItem otherItem;

    @Before
    public void setUp() throws Exception {
        otherItem = new OtherItem("Drum Sticks", 15, 21.99);
    }

    @Test
    public void canGetdescription() {
        assertEquals("Drum Sticks", otherItem.getDescription());
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(6.99, otherItem.calculateMarkUp(), 0.01);
    }
}
