package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployee;

	@FindBy(name = "systemUser[userName]")
	public WebElement campoUsername;

	@FindBy(name = "systemUser[password]")
	public WebElement campoPassword;

	@FindBy(name = "systemUser[confirmPassword]")
	public WebElement confirmarCampoPassword;

	@FindBy(name = "btnSave")
	public WebElement botaoSalvar;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement abaAdmin;
	

	private Object campoConfirmarPassword;

	public void informarCampoEmployeeName(String employee) {
		campoEmployee.sendKeys(employee);
          
	}
	

	public void informarCampoUsername(String Username ) {
		campoUsername.sendKeys(Username);

	}

	public void informarCampoPassword(String senha) {
		campoPassword.sendKeys(senha);

	}

	public void informarCampoConfirmarPassword(String senha) {
		 ((WebElement) campoConfirmarPassword).sendKeys(senha); 

	}

	public void acionarBotaoSalvar() {
		botaoSalvar.click();

	}
	 public void acionarAbaAdmin() {
		 abaAdmin.click();
		 
	 }

}
