import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
       waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasFullVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void decreasesVolumePerDrink(){
        assertEquals(90, waterBottle.haveDrink(10));
    }

    @Test
    public void emptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillUpBottle(){
        waterBottle.haveDrink(20);
//        WaterBottle waterBottle1 = new WaterBottle(90);
        assertEquals(100, waterBottle.fillBottle());
    }

    @Test
    public void bottleFull(){
        assertEquals(100, waterBottle.fillBottle());
    }

}
