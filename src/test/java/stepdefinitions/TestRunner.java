package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.val;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class TestRunner {

    @Autowired
    private TestContext testContext;

    @When("{int} plus {int} is entered on the calculator")
    public void plusIsEnteredOnTheCalculator(int arg0, int arg1) {
        testContext.add("calculatorValue", arg0 + arg1);
    }

    @Then("The returned results should be {int}")
    public void theReturnedResultsShouldBe(int expectedValue) {
        var calculatorValue = testContext.get("calculatorValue", Integer.class).intValue();
        Assert.assertEquals(expectedValue, calculatorValue);
    }
}
