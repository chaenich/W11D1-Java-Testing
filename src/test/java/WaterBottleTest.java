import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void setup() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void canGetVolumeAtStart() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrinkFromWaterBottle() {
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void canEmptyWaterBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillWaterBottle() {
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
