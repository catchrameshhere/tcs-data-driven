package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BasicValidation extends Base{
  @Test
  public void titleValdation() {
	  String expectedTitle = "Facebook – log in or sign up";
	  String actualTitle = driver.getTitle();
	  
	  Reporter.log("Expected page title = " + expectedTitle);
	  Reporter.log("Actual page title = " + actualTitle);
	  
	  assertTrue(actualTitle.equals(expectedTitle), "Page title validation failed,");
  }
  
  @Test
  public void urlValdation() {
	  String expectedUrl = "https://en-gb.facebook.com/";
	  String actualUrl = driver.getCurrentUrl();
	  
	  Reporter.log("Expected url = " + expectedUrl);
	  Reporter.log("Actual url = " + actualUrl);
	  
	  assertTrue(actualUrl.equals(expectedUrl), "Page title validation failed,");
  }
}
