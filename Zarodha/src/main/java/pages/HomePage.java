package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.FrameworkBase;

public class HomePage extends FrameworkBase{
	
	public static void enterCredentials() {

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		Assert.assertTrue(username.isDisplayed());

		username.sendKeys("akashtiwari1202@gmail.com");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(pwd.isDisplayed());
		pwd.sendKeys("natharao");

		WebElement sub = driver.findElement(By.xpath("//button[@id='send2']"));
		sub.click();

		WebElement wel = driver.findElement(By.xpath("//p[@class='welcome-msg']"));

		Assert.assertEquals(wel.getText(), "WELCOME, AKASH BABAN TIWARI!");

	}

	public void verifyTitleOfLogin() {
		
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Home");
	}
}
