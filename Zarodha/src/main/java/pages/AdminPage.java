package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.FrameworkBase;

public class AdminPage extends FrameworkBase {

	public void verifyAdminPage() {

		String admin = driver.findElement(By.xpath("")).getText();

		Assert.assertEquals(admin, "Admin");
	}

}
