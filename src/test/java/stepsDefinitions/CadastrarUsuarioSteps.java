package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utiils.Na;
import static utils.Utiils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;


public class CadastrarUsuarioSteps {
	
	
	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	  
	}

	@Quando("informar campo employee name {string}")
	public void informarCampoEmployeeName(String employeename ) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployeeName(employeename);
	    
	}

	@Quando("informar campo username {string}")
	public void informarCampoUsername(String username){
		Na(CadastrarUsuarioPage.class).informarCampoUsername(username);
	}

	@Quando("informar campo password {string}")
	public void informarCampoPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
	}

	@Quando("informar campo confirmar password {string}")
	public void informarCampoConfirmarPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);;
	  
	}
	
    @Entao("^o sistema cadastra o usuario \"([^\"]*)\"$")
	public void oSistemaCadastraOUsuario(String username) throws Throwable {
    	assertTrue(driver.findElement(By.xpath("//a[text() +username +]" )).isDisplayed());
    	
	}

	@E("^acionar o botao salvar$")
	public void acionarOBotaoSalvar1() throws Throwable {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
		
	}

	@Quando("^acionar aba admin$")
	public void acionarAbaAdmin() throws Throwable {
		Na(TelaInicialPage.class).acionarAbaAdmin();
	}


	

}
