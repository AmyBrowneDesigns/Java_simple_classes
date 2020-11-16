import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator result;

    @Before
    public void before(){
        result = new Calculator(4, 2, 0.0, 0.0);
    }

    @Test
    public void getAddNumbers(){
        assertEquals(6, result.addNumbers());
    }

    @Test
    public void getSubtractNumbers(){
        assertEquals(2, result.subtractNumbers());
    }

    @Test
    public void getMultipliedNumbers(){
        assertEquals(8, result.multiplyNumbers());
    }

    @Test
    public void getDividedNumbers(){
        Calculator newResult = new Calculator(20, 10, 0.0, 0.0);
        assertEquals(2, newResult.divideNumbers());
    }

    @Test
    public void getDividedNumbersUsingDoubles(){
        Calculator newDoublesResult = new Calculator(0, 0, 40.50, 20.15);
        assertEquals(2.01, newDoublesResult.divideDoubleNumbers(), 0.01);
    }

}
