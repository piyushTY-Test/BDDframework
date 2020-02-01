package CucumberQk.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperFunctions;

public class AtaCalcSteps {
	
	WebDriver driver;
	String actRes;
	@Given("ata Super smart calculator exist")
	public void ata_Super_smart_calculator_exist() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=HelperFunctions.createAppropriateDriver("chrome");
		driver.get("http://ata123456789123456789.appspot.com/");
	}

	@When("Enter the First number {string}")
	public void enter_the_First_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		WebElement wb1=driver.findElement(By.id("ID_nameField1"));
		wb1.clear();
		wb1.sendKeys(string);
	}

	@When("Enter the Second number {string}")
	public void enter_the_Second_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//ID_nameField2
		WebElement wb1=driver.findElement(By.id("ID_nameField2"));
		wb1.clear();
		wb1.sendKeys(string);
		
		//gwt-uid-4
		WebElement compareRadBtn=driver.findElement(By.id("gwt-uid-4"));
		boolean stat=compareRadBtn.isSelected();
		System.out.println(stat);
		if(stat)
		{
			System.out.println("Compare radio Button Already Selected");
		}
		else
		{
			compareRadBtn.click();
		}
		
	}

//	@Then("largest number will be {string}")
//	public void largest_number_will_be(String string) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new cucumber.api.PendingException();
//		driver.findElement(By.id("ID_calculator")).click();
//		Thread.sleep(2000);
//		WebElement result=driver.findElement(By.id("ID_nameField3"));
//		Boolean stat1=result.isDisplayed();
//		System.out.println(stat1);
//		if(stat1)
//		actRes= result.getAttribute("value");
//		int actres=Integer.parseInt(actRes);
//		
//		System.out.println("Largest Number is====>"+actRes);
//		driver.close();
//	}
	@Then("largest number will be {int}")
	public void largest_number_will_be(Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("ID_calculator")).click();
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.id("ID_nameField3"));
		Boolean stat1=result.isDisplayed();
		System.out.println(stat1);
		if(stat1)
		actRes= result.getAttribute("value");
		int actres=Integer.parseInt(actRes);
		if(int1==actres) {
			System.out.println("Largest Number is====>"+actRes);
			System.out.println("TestCase Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
				driver.close();
	}
}
