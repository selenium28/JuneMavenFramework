package tests;

import org.testng.annotations.Test;

import core.StepBase;
import pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCases extends StepBase{
	LoginPage objLoginPage;

	@BeforeTest
	public void beforeTest() {
		setup();
	}

	@Test
	public void loginTestCase() {
		objLoginPage = new LoginPage();
		objLoginPage.loginMethod();
	}

	@AfterTest
	public void afterTest() {
		tearDown();
	}

}
