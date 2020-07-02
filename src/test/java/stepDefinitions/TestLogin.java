package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.junit.*;
import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin 
{
	WebDriver driver;
	LoginPage loginPage;
	TestBase testBase;
	HomePage homePage;
	
	@cucumber.api.java.en.Given("user is on Login page")
	public void user_is_on_Login_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
		testBase = new TestBase();
		testBase.initialization();
		loginPage = new LoginPage();
		String title=loginPage.getPageTitle();
		Assert.assertTrue(title.contains("Login"));
	}

	@cucumber.api.java.en.Given("^user enters \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\"$")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUsername(string);
		loginPage.enterPassword(string2);
	   
	}
	
	@cucumber.api.java.en.Given("clicks Login button")
	public void clicks_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		/*
		 * Thread.sleep(2500); Actions action=new Actions(driver);
		 * action.click(driver.findElement(By.id("login"))).build().perform();
		 *///
		loginPage.clickLogin();
	}
	
	@cucumber.api.java.en.Then("verify that user lands on Home page")
	public void verify_that_user_lands_on_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
		homePage = new HomePage();
		WebElement newItemIcon=homePage.getPageLandingProof();
		//Assert.assertTrue(newItemIcon.isDisplayed());
		Assert.assertTrue("Success!", newItemIcon.isEnabled());
	}
}
