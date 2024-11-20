package simple.calculator.test.ArithmeticOperator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test
    public void testSum() {

        int actualValue = calc.sum(100, 300);
        Assert.assertEquals(actualValue, 400, "something went wrong!");

    }
}
