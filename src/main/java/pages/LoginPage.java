package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;

public class LoginPage extends StepBase{
	
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
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
	}
	
}
