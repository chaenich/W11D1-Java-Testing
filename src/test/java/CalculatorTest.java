import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }


    @Test
    public void canAddTwoNumbers() {
        double num1 = 10.00;
        double num2 = 5.00;
        assertEquals(15.00, calculator.add(num1, num2), 0.01);
    }

    @Test
    public void canSubtractSecondNumberFromFirstNumber() {
        double num1 = 22.00;
        double num2 = 11.00;
        assertEquals( 11.00, calculator.subtract(num1, num2), 0.01);
    }

    @Test
    public void canMultiplyTwoNumbers() {
        double num1 = 4.00;
        double num2 = 3.00;
        assertEquals(12.00, calculator.multiply(num1, num2), 0.01);
    }

    @Test
    public void canDivideFirstNumberBySecondNumber() {
        double num1 = 22.00;
        double num2 = 11.00;
        assertEquals( 2.00, calculator.divide(num1, num2), 0.01);
    }

}
