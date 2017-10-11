package test;


import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    public void testFail() {
        fail("This is intended exception");
    }

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10.0, 50.0);
        assertEquals("test add" , 60.0, result, 0.001);
    }

    public static void main(String[] args) {
        CalculatorTest calculatorTest =  new CalculatorTest();
//        calculatorTest.testFail();
        calculatorTest.testAdd();
    }
}
