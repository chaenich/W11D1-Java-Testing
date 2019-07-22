import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle = new WaterBottle();

    @Test
    public void canGetVolumeAtStart() {
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canDrinkFromWaterBottle() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void canEmptyWaterBottle() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFillWaterBottle() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
