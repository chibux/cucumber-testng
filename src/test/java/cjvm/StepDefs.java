package cjvm;

import cucumber.api.java.en.When;
import org.testng.Assert;


public class StepDefs {

    @When("I run step 1")
    public void i_run_step_1() {
        System.out.println("I run step 1");
    }

    @When("I fail step 2")
    public void i_fail_step_2() {
        Assert.fail("I fail step 2");
    }

    @When("I run step 3")
    public void i_run_step_3() {
        System.out.println("I run step 3");
    }
}
