public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double addTwoNumbers() {
        return this.number1 + this.number2;
    }

    public double subtractANumber() {
        return this.number1 - this.number2;
    }

    public double multiplyTwoNumbers() {
        return this.number1 * this.number2;
    }

    public double divideNumber1ByNumber2() {
        return this.number1 / this.number2;
    }
}
