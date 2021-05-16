package stepDefinition;

import PageObjects.HomePageObj;
import PageObjects.RegisterPageObj;
import Resource.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageStep extends Base {
	
	  @Given("^User launches qaacademy application$")
	    public void user_launches_qaacademy_application() throws Throwable {
		  driver = InitializedDriver();	
	    }

	    @When("^User clicks on Register button$")
	    public void user_clicks_on_register_button() throws Throwable {
	    	HomePageObj hp = new HomePageObj(driver);
			hp.register().click();
	    }
	    
	    @Then("^User navigated to Register Page and enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_navigated_to_register_page_and_enters_something_and_something_and_something(String strArg1, String strArg2, String strArg3) throws Throwable {
	    	RegisterPageObj rpo = new RegisterPageObj(driver);
			rpo.fullName().sendKeys(strArg1);
			rpo.email().sendKeys(strArg2);
			rpo.password().sendKeys(strArg3);
			rpo.confirmPassword().sendKeys(strArg3);	
			driver.close();
	    }
}
