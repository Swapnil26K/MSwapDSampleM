package stepDefinitions;

import org.junit.Assert;

import pages.CreateItem;
import pages.HomePage;
import utility.TestUtil;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.Given;


public class TesttHome 
{
	
	//CreateItem createItem;
	HomePage homePage;	
	
	@cucumber.api.java.en.Given("user has logged in into the application")
	public void user_has_logged_in_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login Successful");
	}

	
	@cucumber.api.java.en.Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
			System.out.println("User is on home page");
	}
	
	
	@cucumber.api.java.en.Given("user clicks Create Item icon")
	public void user_clicks_Create_Item_icon() {
	    // Write code here that turns the phrase above into concrete actions
		
		homePage = new HomePage();	
		homePage.clickCreateNewItem();
	}
	
	
	@cucumber.api.java.en.Then("verify that user lands on Create New Item page")
	public void verify_that_user_lands_on_Create_New_Item_page() {
	    // Write code here that turns the phrase above into concrete actions
		//String spanText=createItem.getSpanText();
		//Assert.assertTrue(spanText, spanText.contains("Create Item"));
	}
}
