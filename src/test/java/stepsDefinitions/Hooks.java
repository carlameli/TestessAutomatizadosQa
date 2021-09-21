package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utiils.*;

public class Hooks {
	
	@Before (value = "@login")
	public void sfuncionalidadeLogin() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	@Before()
	public void setUp() {
		acessarSistema();
		
	}
		
	 @After
	public void tearDown() {
		
	}
}
