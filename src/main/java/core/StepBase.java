package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepBase {
	
	public static WebDriver driver;
	
	public static void setup() {
		String url = "https://opensource-demo.orangehrmlive.com/";

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Browser Launched");
	
	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	

}
