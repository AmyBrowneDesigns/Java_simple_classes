import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator result;

    @Before
    public void before(){
        result = new Calculator();
    }

    @Test
    public void getAddNumbers(){
        assertEquals(6, result.addNumbers(2, 4));
    }

    @Test
    public void getSubtractNumbers(){
        assertEquals(2, result.subtractNumbers(4, 2));
    }

    @Test
    public void getMultipliedNumbers(){
        assertEquals(8, result.multiplyNumbers(2, 4));
    }

    @Test
    public void getDividedNumbers(){
        assertEquals(2.01, result.divideNumbers(40.50, 20.15), 0.01);
    }

}
