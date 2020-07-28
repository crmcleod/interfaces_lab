import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before(){ cdPlayer = new CDPlayer("Tibo", "TI435CDP", 2);}

    @Test
    public void hasMake(){
        assertEquals("Tibo", cdPlayer.make());}

    @Test
    public void hasModel(){
        assertEquals("TI435CDP", cdPlayer.model());
    }
}

