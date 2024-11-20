package simple.calculator.test.ArithmeticOperator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithOpTest3 {

    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();

    }

    @Test(dataProvider = "getData")
    public void testSum(int input1, int input2, int output) {

        int actualValue = calc.sum(input1, input2);
        Assert.assertEquals(actualValue, output, "something went wrong!");
    }

    @DataProvider
    public Object[][] getData() {

        return new Object[][]{

                {200, 500, 700},
                {-200, -500, 700},
                {0, -1, -1},
                {0, -1, -1}
        };
    }


}
