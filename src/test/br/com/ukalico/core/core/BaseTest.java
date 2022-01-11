package br.com.ukalico.core.core;

import br.com.ukalico.core.pages.LoginPage;
import com.philips.tasy.pages.LoginPageTasy;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.io.IOException;

public abstract class BaseTest {

    @Rule
	public TestName testName = new TestName(); /** contem o nome do teste*/
	
	protected LoginPage page = new LoginPage(); /** contem a pagina de login*/

	protected LoginPageTasy pageTasy = new LoginPageTasy(); /** contem a pagina de login*/

	@Before
    protected abstract void inicializa(); /**Acessa o sistema a ser testado */
	
	@After
	protected abstract void finaliza() throws IOException; /**Acessa o sistema a ser testado */

}
