import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BikeTest  {

    @Test
    public void bike(){
        Bike bike = new Bike();
    }

    @Test
    public void testThatCanBeTurnedOn_OnBike(){
        Bike bike = new Bike();
        assertFalse(bike.bikeIsOn());
        bike.geBikeIsOn();
        assertTrue(bike.bikeIsOn());
    }

    @Test
    public void testThatCanBeTurnedOff_OffBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        bike.geBikeIsOff();
        assertFalse(bike.bikeIsOn());
    }

    @Test
    public void testThatCanBeAcceleratedBy1_AccelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(16, bike.accelerateBikeBy1(15, 1));
    }
    @Test
    public void testThatCanBeAcceleratedBy2_AccelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(26, bike.accelerateBikeBy2(24, 2));
    }

    @Test
    public void testThatCanBeAcceleratedBy3_AccelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(38, bike.accelerateBikeBy3(35, 3));
    }

    @Test
    public void testThatCanBeAcceleratedBy4_AccelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(48, bike.accelerateBikeBy4(44, 48));
    }

    @Test
    public void testThatCanBeDecelratesBy1_DelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(14, bike.decelerateBikeBy1(15 ,1));
    }

    @Test
    public void testThatCanBeDecelratesBy2_DelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(22, bike.decelerateBikeBy2(24 ,2));
    }

    @Test
    public void testThatCanBeDecelratesBy3_DelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(32, bike.decelerateBikeBy3(35 ,3));
    }


    @Test
    public void testThatCanBeDecelratesBy4_DelerateBike(){
        Bike bike = new Bike();
        assertTrue(bike.bikeIsOn());
        assertEquals(40, bike.decelerateBikeBy4(44 ,4));
    }


}
