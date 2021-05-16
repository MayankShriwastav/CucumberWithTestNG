package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObj {
	
	WebDriver driver;
	public HomePageObj(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//we have achived encapsulation where every variable is private and methods are public.
	
	private @FindBy(css ="a[href*=sign_in]")
	WebElement login;
	
	private @FindBy(xpath ="//h2[contains(text(),'Featured Courses')]")
	WebElement courses;
	
	private @FindBy(css =".navbar-collapse.collapse")
	WebElement nevigationBar;
	
	private@FindBy(css ="a[href*='sign_up']")
	WebElement register;
	
	//private @FindBy(css ="a[href*='practice']")
	//WebElement practice;
	
	private @FindBy(linkText ="Practice Projects")
	WebElement practice;
	
	private @FindBy(xpath="//button[text()='NO THANKS']")
	List<WebElement> popUp;
	
	public WebElement login(){
		return login;
	}
	
	public WebElement courses(){
		return courses;
	}
	
	public WebElement nevigationBar(){
		return nevigationBar;
	}
	
	public WebElement register(){
		return register;
	}
	public WebElement practice(){
		return practice;
	}
	
	public List<WebElement> popUp(){
		return popUp;
	}

}
