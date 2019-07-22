import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator( 10.00, 5.00);
    }

    @Test
    public void canAddTwoNumbers() {
        assertEquals(15.00, calculator.addTwoNumbers(), 0.01);
    }

    @Test
    public void canSubtractSecondNumberFromFirstNumber() {
        assertEquals( 5.00, calculator.subtractANumber(), 0.01);
    }

    @Test
    public void canMultiplyTwoNumbers() {
        assertEquals(50.00, calculator.multiplyTwoNumbers(), 0.01);
    }

    @Test
    public void canDivideFirstNumberBySecondNumber() {
        assertEquals( 2.00, calculator.divideNumber1ByNumber2(), 0.01);
    }

}
