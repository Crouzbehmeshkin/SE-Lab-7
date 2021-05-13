package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OpStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private char calc_op;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }



    @Given("^Two input values, (-?\\d+) and (-?\\d+), and an operation ([/^])$")
    public void twoInputValuesAndAndAnOperation(int arg0, int arg1, char op) {
        value1 = arg0;
        value2 = arg1;
        calc_op = op;
    }

    @When("^I apply the operation$")
    public void iApplyTheOperation() {
        result = calculator.apply(value1, value2, op);
        System.out.println(result);
    }

}
