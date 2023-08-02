package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.UtilityPage;

public class HomePage extends UtilityPage {
	@FindBy(xpath = "//input[@id='email']")
	public WebElement userName;

	@FindBy(id = "pass")
	public WebElement passWord;

	@FindBy(name = "send")
	public WebElement submitBtn;

	@FindBy(name = "send")
	public List<WebElement> btn;

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

	public void loginIntoTechPanda() {

		PageFactory.initElements(driver, this);

		System.out.println("Title of page=" + driver.getTitle());
		inputValue(userName, prop.getProperty("user"));

		System.out.println("Attribute Value::" + userName.getAttribute("title"));

		inputValue(passWord, prop.getProperty("pass"));

		clickOnElement(submitBtn);

		Assert.assertEquals("My Acc", driver.getTitle());

	}
}
