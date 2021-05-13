package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private char calc_op;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I add the two values$")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
    }

    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

    @Given("^Two input values, (-?\\d+) and (-?\\d+), and an operation ([/^])$")
    public void twoInputValuesAndAndAnOperation(int arg0, int arg1, char op) {
        value1 = arg0;
        value2 = arg1;
        calc_op = op;
    }

    @When("^I apply the operation$")
    public void iApplyTheOperation() {
        result = calculator.apply(value1, value2, calc_op);
    }
}
