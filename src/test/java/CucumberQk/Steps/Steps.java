package CucumberQk.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import cucumberQk.*;

public class Steps {

	Calculator cal=null;
	int res;

	@Given("calculator exists")
	public void calculator_exists() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("calculator exists");

		//given Method We are Trying TO create a Calculator Method
		cal=new Calculator();
	}

	@When("add is called with two numbers")
	public void add_is_called_with_two_numbers() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.out.println("add is called with two numbers");
		res=cal.add(10, 20);
	}

	@Then("result is the addition of the two number")
	public void result_is_the_addition_of_the_two_number() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.out.println("result is the addition of the two number");
		System.out.println("Result====>"+res);
	}
	@When("add is called with {int} and {int}")
	public void add_is_called_with_and(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		res=cal.add(int1, int2);
	}

	@Then("result {int}")
	public void result(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		if(res==int1)
		{
			System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("Result is Fail");
		}
	}
	@When("add is called with {double} and {double}")
	public void add_is_called_with_and(Double double1, Double double2) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		cal.add(double1, double2);
	}

	@Then("result must display {string}")
	public void result_must_display(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		String actErrorMsg=cal.getErrorMsg();
		boolean stat=actErrorMsg.equals(string);
		Assert.assertTrue(stat);
		System.out.println("Test Case Pass ");
	}
	@When("add is called with {double} and {int}")
	public void add_is_called_with_and(Double double1, Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		cal.add(double1, int1);
	}

	@When("add is called with {int} and {double}")
	public void add_is_called_with_and(Integer int1, Double double1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		cal.add(int1, double1);
	}
}
