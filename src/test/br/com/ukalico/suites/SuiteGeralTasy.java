package br.com.ukalico.suites;

import br.com.ukalico.core.core.DriverFactory;
import com.philips.tasy.pages.LoginPageTasy;
import com.philips.tasy.tests.LoginTasyTest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	     // Inserir classes da suite de testes do tasy aquui
		LoginTasyTest.class

})
public class SuiteGeralTasy {
	
	private static LoginPageTasy page = new LoginPageTasy();


	/** User esse metodo para resetar BD via aplicação ou script SQL*/
	@BeforeClass
	public static void reset() {

		//page.resetar();

		// fecha janela do browser apos executar os testes
		DriverFactory.killDriver(); 
		
		
	}

}
