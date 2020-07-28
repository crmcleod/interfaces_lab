import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio r;

    @Before
    public void before() {
        r = new Radio("DAB", "X3", "Radio 1");
    }

    @Test
    public void testTune() {
        assertEquals("Radio 1", r.tune());
    }


}
