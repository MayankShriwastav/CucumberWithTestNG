package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePageObj;
import Resource.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageStep extends Base {
	WebDriver driver;
	HomePageObj hpo;
	
	@Given("^User launches home application$")
	public void user_launches_home_application() throws Throwable {
		driver = InitializedDriver();	
	}

	@When("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		hpo = new HomePageObj(driver);
		if(hpo.popUp().size()>0){
			hpo.popUp().get(0).click();
		}
	}

	@Then("^User searches for Featured Courses and navigation bar$")
	public void user_searches_for_Featured_Courses_and_navigation_bar() throws Throwable {
		hpo = new HomePageObj(driver);
		Assert.assertEquals("FEATURED COURSES", hpo.courses().getText());
		Assert.assertTrue(hpo.nevigationBar().isDisplayed());
		System.out.println("Feature Courses and Navigation bar is available");
	}

	@And("^User clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {
		hpo = new HomePageObj(driver);
		hpo.login().click();
		driver.close();
	}

}
