package CucumberQk.Steps;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.HelperFunctions;

public class GoogleSearchSteps {

	WebDriver driver;
	@Given("a web browser is on the Google page")
	public void a_web_browser_is_on_the_Google_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver=HelperFunctions.createAppropriateDriver("chrome");
		driver.get("https://www.google.com");
	}

	@When("the search phrase {string} is entered")
	public void the_search_phrase_is_entered(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
//		By bysearch=By.name("q");
//		WebElement wb= driver.findElement(bysearch);
		driver.findElement(By.name("q")).sendKeys(string,Keys.ENTER);;
		System.out.println("Search===== "+string);
	
	}

	@Then("results for {string} are shown")
	public void results_for_are_shown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String title=driver.getTitle();
		System.out.println(title);
	    
		boolean status=title.contains(string);
		Assert.assertTrue(status);
		if(status)
		{
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		
		
		driver.quit();
	}
}
