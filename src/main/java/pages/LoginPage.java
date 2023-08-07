package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class LoginPage extends StepBase{
	
	UtilityClass ojUtilityClass = new UtilityClass();
	
	@FindBy(xpath = "//*[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() {
		ojUtilityClass.sendKeysWebElements(userName, "Admin");
		ojUtilityClass.sendKeysWebElements(password, "admin123");
		ojUtilityClass.clickOnWebElement(loginButton, 2);
	}
	
}
