//package stepDefinition;
//
//import org.openqa.selenium.WebDriver;
//
//import PageObjects.HomePageObj;
//import PageObjects.PracticePageObj;
//import Resource.Base;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class PracticePageStep extends Base {
//	WebDriver driver;
//	
//    @Given("^User launches academy application$")
//    public void user_launches_academy_application() throws Throwable {
//    	driver = InitializedDriver();	
//    }
//
//    @When("^User clicks on Practice button$")
//    public void user_clicks_on_practice_button() throws Throwable {
//    	HomePageObj hpo = new HomePageObj(driver);
//    	hpo.practice().click();
//    }
//
//    @Then("^User navigated to Practice Page$")
//    public void user_navigated_to_practice_page() throws Throwable {
//    	PracticePageObj ppo = new PracticePageObj(driver);
//		Assert.assertTrue(ppo.pageText().isDisplayed());	
//		driver.close();
//    }
//}
