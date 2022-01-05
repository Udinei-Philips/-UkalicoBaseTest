package br.com.ukalico.core.core;

import br.com.ukalico.core.pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static br.com.ukalico.core.core.DriverFactory.getDriver;
import static br.com.ukalico.core.core.DriverFactory.killDriver;

public class BaseTest {
	
	@Rule
	public TestName testName = new TestName();
	
	private LoginPage page = new LoginPage();
		
	
	@Before
	public void inicializa(){
		page.acessarTelaInicial();
		
		page.setEmail("udineisilva@gmail.com");
		page.setSenha("123456");
		page.entrar();
	}
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
				File.separator + testName.getMethodName() + ".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}

}
