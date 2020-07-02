package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="UserName")
	WebElement userName;

	@FindBy(id="Password")
	WebElement password;

	@FindBy(id="login")
	WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}	
	
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void enterUsername(String username)
	{
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
}
