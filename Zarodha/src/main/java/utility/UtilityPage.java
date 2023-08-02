package utility;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import base.FrameworkBase;

public class UtilityPage extends FrameworkBase {

	public  void isElementPresentOnPage(WebElement element) {
		wait(2);
		Assert.assertTrue(element.isDisplayed(),"WebElemenet is not present on page");
	}

	public  void clickOnElement(WebElement element) {
		isElementPresentOnPage(element);
		wait(2);
		element.click();
		
	}

	public String getProperties(String key) {
		
		String str = prop.getProperty(key);
		
		return str;
	}

	public  void inputValue(WebElement element, String str) {
		isElementPresentOnPage(element);
		wait(2);
		element.sendKeys(str);
	}

	public static void wait(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
		}

	}
	
	@DataProvider(name = "name")
	public Object[][] getData() {

		Object[][] cred = { 
				{ "akashtiwari1202@gmail.com", "natharao" }, 
				{ "abct@gmail.com", "xyy1234" },
				{ "rathod@gmail.com", "rathodnatha" }
				};
		return cred;
	}
	
	@DataProvider(name = "credentials")
	public Object[][] getTestData() {

		Object[][] cred = { 
				{ "akashtiwari1202@gmail.com", "natharao" }, 
				{ "abct@gmail.com", "xyy1234" },
				{ "rathod@gmail.com", "rathodnatha" }
				};
		return cred;
	}
}
