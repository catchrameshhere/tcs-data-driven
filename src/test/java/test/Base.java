package test;


import utils.Common;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Base {
	Common common;
	static WebDriver driver;

	@Parameters({"browser", "url"})
	@BeforeTest
	public void beforeTest(String browser, String url) {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}

	@AfterTest
	public void afterTest() {
//		common.quitBrowser();
	}

}
