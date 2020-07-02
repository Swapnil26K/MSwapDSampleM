package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CreateItem extends TestBase
{
	public CreateItem()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[text()='Create Item'])[2]")
	WebElement spanText;
	
	public String getSpanText()
	{
		return spanText.getText();
	}

}
