package com.philips.tasy.tests;

import com.philips.tasy.core.BaseTestCoreTasy;
import com.philips.tasy.core.MenuPageTasy;
import com.philips.tasy.pages.CadastroCompletoDePessoasPage;
import org.junit.Test;

public class CadastroCompletoDePessoasTest extends BaseTestCoreTasy {

    MenuPageTasy menuPageTasy = new MenuPageTasy();
    CadastroCompletoDePessoasPage cadCompletoPessoas = new CadastroCompletoDePessoasPage();


    @Test
    public void acessarTelaDaFuncao() {
        menuPageTasy.acessarTelaInicial();
        cadCompletoPessoas.pesquisarFuncao();
        cadCompletoPessoas.clickNomeDaFuncao();
        cadCompletoPessoas.clicarBotaoAdicionar();
    }


}