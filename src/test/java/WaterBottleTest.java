import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle water_bottle;

    @Before
    public void before(){
        water_bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100.00, water_bottle.getVolume(), 0.00);
    }

    @Test
    public void canDrink(){
        water_bottle.drink();
        assertEquals(90.00, water_bottle.getVolume(), 0.00);
    }

    @Test
    public void canEmpty(){
        water_bottle.empty();
        assertEquals(0.00, water_bottle.getVolume(), 0.00);
    }

    @Test
    public void canFill(){
        water_bottle.empty();
        water_bottle.fill();
        assertEquals(100.00, water_bottle.getVolume(), 0.00);
    }

}
