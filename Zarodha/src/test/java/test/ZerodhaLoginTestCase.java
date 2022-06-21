package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class ZerodhaLoginTestCase extends LoginPage {

	@BeforeMethod
	public void launchBrw() {
		browserLaunch();
	}

	@Test(invocationCount = 1, groups = "Regression")
	public void testMethod1() {

		System.out.println("Test Method 1");
		eneterCredentials();
	}

	@Test(groups = "Regression")
	public void testMethod2() {

		System.out.println("Test Method 2");
		eneterCredentials("GTPL Bank Manager HomePag");
	}

	@Test(groups = "smoke")
	public void testMethod3() {

		System.out.println("Test Method 3");
		Assert.assertTrue(false, "Value is not matched");

	}

	@Test(groups = "Sanity")
	public void testMethod4() {

		System.out.println("Test Method 4");
		Assert.assertTrue(false, "Sanity test case value is not matched");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
