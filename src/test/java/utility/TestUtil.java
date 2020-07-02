package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class TestUtil extends TestBase
{
	WebDriverWait webDriverWait;
	public void waitForElements(WebElement element)
	{
		webDriverWait = new WebDriverWait(driver, 20);
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}

}
