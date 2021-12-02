package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;

public class LoginValidation extends Base{

	@Parameters({"validUsername", "validPassword"})
	@Test
	public void validUsernameValidPassword(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Parameters({"invalidUsername", "validPassword"})
	@Test
	public void invalidUsernameValidPassword(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Parameters({"validUsername", "invalidPassword"})
	@Test
	public void validUsernameInvalidPassword(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Parameters({"invalidUsername", "invalidPassword"})
	@Test
	public void invalidUsernameInvalidPassword(String username, String password) {
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Parameters({"validPassword"})
	@Test
	public void blankUsernameValidPassword(String password) {
		String username = "";
		
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Parameters({"validUsername"})
	@Test
	public void validUsernameBlankPassword(String username) {
		String password = "";
		
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	@Test
	public void blankUsernameBlankPassword() {
		String username = "";
		String password = "";
		
		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}
	
	
	
}
