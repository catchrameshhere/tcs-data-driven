package test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.ReadYamlFile;

public class LoginWithYaml extends Base{
	String username;
	String password;
	String fileName = "user.yaml";
	HashMap<String, Object> map;

	@BeforeClass
	public void beforeClass() {
		ReadYamlFile ryf = new ReadYamlFile();
		map = ryf.readYamlFile(fileName);
	}



	@Test
	public void validUsernameValidPassword() {
		HashMap<String, String> u1 =  (HashMap<String, String>) map.get("u1");

		username = u1.get("username");
		password = u1.get("password");

		Login obj = new Login(driver);
		obj.loginWithCrendentials(username, password);
	}


}
