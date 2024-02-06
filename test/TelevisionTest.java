import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void tv(){
        Television television = new Television();
    }
    @Test
    public void testTurnOnTv_ItIsOn() {
        Television television = new Television();
       assertFalse(television.televisionIsOn());
       television.geTvIsOn();
       assertTrue(television.televisionIsOn());
    }

    @Test
    public void testTurnOffTv_ItIsOff() {
        Television television = new Television();
        television.geTvIsOn();
        assertTrue(television.televisionIsOn());
        television.getTvIsOff();
        assertFalse(television.televisionIsOn());


    }

    @Test
    public void testIncreaseVolume_VolumeIncrease(){
        Television television = new Television();
        television.geTvIsOn();
        assertTrue(television.televisionIsOn());
        int volume = television.getTvVolume();
        assertEquals(10, volume);
        television.increaseVolume();
        assertEquals(11, television.getTvVolume());

    }

    @Test
    public void testReducesVolume_VolumeReduce(){
        Television television = new Television();
        television.geTvIsOn();
        assertTrue(television.televisionIsOn());
        int volume = television.getTvVolume();
        assertEquals(10, volume);
        television.reduceVolume();
        assertEquals(10, television.getTvVolume());

    }

    @Test
    public void testChangeChannel_ChannelChange(){
        Television television = new Television();
        television.geTvIsOn();
        assertTrue(television.televisionIsOn());
        television.changeChannel();
        assertEquals(2, television.getChannel());
    }

    @Test
    public void testChangeChannelBack_changeChannelBack(){
        Television television = new Television();
        television.geTvIsOn();
        assertTrue(television.televisionIsOn());
        for (int check = 0; check < 5; check++) {
            television.changeChannel();
        }
        television.changeChannelBack();
        assertEquals(5, television.getChannel());

    }
}
