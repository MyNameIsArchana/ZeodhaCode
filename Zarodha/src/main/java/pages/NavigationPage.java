package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.FrameworkBase;

public class NavigationPage extends FrameworkBase
{
	public void verifyNavigationPage() {

		String nav = driver.findElement(By.xpath("")).getText();

		Assert.assertEquals(nav, "nav");
	}
	
}
