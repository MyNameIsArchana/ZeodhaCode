package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.FrameworkBase;

public class LoginPage extends FrameworkBase {

	@FindBy(name = "uid")
	public WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;

	@FindBy(name = "btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//input[@id='email']")
	public WebElement userTechPanda;

	@FindBy(xpath = "//input[@id='pass']")
	public WebElement pwdTechPanda;

	@FindBy(xpath = "//button[@id='send2']")
	public WebElement LoginBtnTechPanda;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void eneterCredentials() {
		PageFactory.initElements(driver, this);
		String user = prop.getProperty("username");
		username.sendKeys(user);
		String pwd = prop.getProperty("password");
		password.sendKeys(pwd);
		loginBtn.click();
		Assert.assertEquals("GTPL Bank Manager HomePage", driver.getTitle());
	}

	public void eneterCredentials(String titleofPage) {
		PageFactory.initElements(driver, this);
		String user = prop.getProperty("username");
		username.sendKeys(user);
		String pwd = prop.getProperty("password");
		password.sendKeys(pwd);
		loginBtn.click();
		Assert.assertEquals(titleofPage, driver.getTitle());
	}

	public void logintotechPand() {
		PageFactory.initElements(driver, this);
		userTechPanda.sendKeys(prop.getProperty("UserNameTechPanda"));
		pwdTechPanda.sendKeys(prop.getProperty("PasswordTechPanda"));
		LoginBtnTechPanda.click();

	}

	public void logintonGuru99() {

		PageFactory.initElements(driver, this);
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();

	}

}
