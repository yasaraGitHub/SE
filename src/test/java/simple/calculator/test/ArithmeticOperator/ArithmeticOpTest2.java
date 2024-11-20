package simple.calculator.test.ArithmeticOperator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOpTest2 {


    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test
    public void testSum() {

       // int actualValue = calc.sum(200, 500);
        System.out.println("Assertion Point 1");
        Assert.assertEquals(calc.sum(200, 500), 700, "something went wrong!");
        System.out.println("Assertion Point 2");
        Assert.assertEquals(calc.sum(-200, -500), 700, "something went wrong!");
        System.out.println("Assertion Point 3");
        Assert.assertEquals(calc.sum(0, 1), 1, "something went wrong!");
        System.out.println("Assertion Point 4");
        Assert.assertEquals(calc.sum(0, -1), -1, "something went wrong!");
        System.out.println("Assertion Point 5");

    }
}
