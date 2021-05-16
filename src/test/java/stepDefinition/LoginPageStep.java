package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePageObj;
import PageObjects.LoginPageObj;
import Resource.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends Base {
	WebDriver driver;

	@Given("^User launches Login application$")
	public void user_launches_login_application() throws Throwable {
		driver = InitializedDriver();		  
	}
	
	   @When("^User clicks on login button$")
	    public void user_clicks_on_login_button() throws Throwable {
		   HomePageObj hpo = new HomePageObj(driver);
			hpo.login().click();
	    }

	@And("^User enters the invalid login (.+) and (.+)$")
	public void user_enters_the_invalid_login_and(String username, String password) throws Throwable {
		LoginPageObj lp = new LoginPageObj(driver);
		lp.userName().sendKeys(username);
		lp.password().sendKeys(password);
	}

	@And("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		LoginPageObj lp = new LoginPageObj(driver);
		lp.submit().click();
	}

	@Then("^User gets restricted message$")
	public void user_gets_restricted_message() throws Throwable {
		driver.close();
	}

}
