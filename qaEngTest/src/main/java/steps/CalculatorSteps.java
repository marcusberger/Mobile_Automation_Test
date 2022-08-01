package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pageObjects.CalculatorPage;

import static utils.Utils.driver;

public class CalculatorSteps {

    CalculatorPage page = new CalculatorPage(driver);

    @Dado("que o usuario esteja na calculadora")
    public void que_o_usuario_esteja_na_calculadora() {
        page.validarQueEstouNoApp();
    }

    @Quando("o usuario clicar o valor {string}")
    public void o_usuario_clicar_o_valor(String valor1) {
        page.clicarBtn5();
        Assert.assertEquals("5", valor1);
    }

    @E("digitar a operacao de soma")
    public void digitar_a_operacao_de_soma() {
        page.btnSoma();
    }

    @E("clicar o valor {string}")
    public void clicar_o_valor(String valor2) {
        page.clicarBtn3();
        Assert.assertEquals("3", valor2);
    }

    @Quando("clicar no igual")
    public void clicarNoIgual() {
        page.btnIgual();
    }

    @Entao("o resultado apresentado devera ser {string}")
    public void o_resultado_apresentado_devera_ser(String resultado) {
        page.validarResultado();
    }

    @Quando("digitar a operacao de subtracao")
    public void digitarAOperacaoDeSubtracao() {
        page.btnSubtracao();
    }

    @Quando("digitar a operacao de multiplicacao")
    public void digitarAOperacaoDeMultiplicacao() {
        page.btnMultiplicacao();
    }
}
