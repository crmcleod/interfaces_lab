import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class StereoTest {

    Stereo stereo;

    @Before
    public void before(){
        stereo = new Stereo("Bob");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", stereo.getName());
    }

    @Test
    public void testCDPlayer() {
        assertEquals("I am Bob's CD Player, connecting", stereo.playCD());
    }

    @Test
    public void testMP3Player(){
        assertEquals("I am Bob's MP3 Player, connecting", stereo.playMP3());
    }

    @Test
    public void testRecordDeck(){
        assertEquals("I am Bob's record deck, connecting", stereo.playRecord());
    }

    @Test
    public void testRadio(){
        assertEquals("I am Bob's radio, connecting", stereo.tuneRadio());
    }

    @Test
    public void testVolumeStartsZero(){
        assertEquals(0, stereo.volume(), 0.1);
    }

    @Test
    public void testVolumeIncrease(){
        stereo.raiseVolume(1);
        assertEquals(1, stereo.volume(), 0.1);
    }

    @Test
    public void testVolumeDecrease(){
        stereo.raiseVolume(10);
        stereo.decreaseVolume(5);
        assertEquals(5, stereo.volume(), 0.1);
    }

    @Test
    public void testVolumeWontDecreaseAtZero(){
        stereo.decreaseVolume(10);
        assertEquals(0, stereo.volume(), 0.1);
    }
}
