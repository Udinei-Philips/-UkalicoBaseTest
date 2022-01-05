package br.com.ukalico.core.tests;

import br.com.ukalico.core.core.BaseTest;
import br.com.ukalico.core.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends BaseTest {
	HomePage page = new HomePage();

	@Test
	public void testSaldoConta(){
		Assert.assertEquals("534.00", page.obterSaldoConta("Conta para saldo"));
	}
}
