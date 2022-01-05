package br.com.ukalico.suites;

import br.com.ukalico.core.core.DriverFactory;
import br.com.ukalico.core.pages.LoginPage;
import br.com.ukalico.core.tests.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeralCore {
	
	private static LoginPage page = new LoginPage();
	
	
	
	@BeforeClass
	public static void reset() {
		// o script sql de reset do BD ser invocado nesse ponto tb
		
		page.acessarTelaInicial();
		
		page.setEmail("udineisilva@gmail.com");
		page.setSenha("123456");
		page.entrar();
		
		// resetando o BD via script do sistema
		page.resetar();
		
		// fecha janela do browser
		DriverFactory.killDriver(); 
		
		
	}

}
