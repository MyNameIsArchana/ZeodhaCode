package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkBase {

	public static WebDriver driver = null;

	public static Properties prop = null;

	public static String path = System.getProperty("user.dir");

	public FrameworkBase() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(path + "/src/main/java/config/testData.properties");
			prop.load(fis);
		} catch (Exception e) {
		}
	}

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

}
