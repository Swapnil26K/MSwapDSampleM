package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;


public class HomePage extends TestBase
{
	@FindBy(xpath="(//span[contains(text(),'Create Item ')]//parent::div//parent::div//parent::a)[2]")
	WebElement createItemIcon;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}	

	public WebElement getPageLandingProof()
	{
		return createItemIcon;
	}	
	
	public void clickCreateNewItem()
	{
		//HomePage homePage=new HomePage();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", createItemIcon);
	}
	
	
}
