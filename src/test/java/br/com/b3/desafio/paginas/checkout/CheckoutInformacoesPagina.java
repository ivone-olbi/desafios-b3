package br.com.b3.desafio.paginas.checkout;

import org.openqa.selenium.By;

import br.com.b3.desafio.configuracoes.Navegador;
import lombok.RequiredArgsConstructor;

/**
 * <p>Responsavel pela pagina de preenchimento das informacoes do checkout.
 * {@linkplain https://www.saucedemo.com/checkout-step-one.html}
 */
@RequiredArgsConstructor
public class CheckoutInformacoesPagina {

    // Injetado via PicoContainer.
    private final Navegador navegador;

    /**
     * <p>Preencher o "input" chamado "First Name" da pagina de informacoes sobre o checkout.</p>
     * @param nome valor que sera preenchido como primeiro nome
     */
    public void preencherNome(final String nome) {
        navegador.findElement(By.id("first-name")).sendKeys(nome);
    }

    /**
     * <p>Preencher o "input" chamado "Last Name" da pagina de informacoes sobre o checkout.</p>
     * @param sobrenome valor que sera preenchido
     */
    public void preencherSobrenome(final String sobrenome) {
        navegador.findElement(By.id("last-name")).sendKeys(sobrenome);
    }

    /**
     * <p>Preencher o "input" chamado "Zip/Posta Code" da pagina de informacoes sobre o checkout.</p>
     * @param cep numero do CEP sem pontuacao
     */
    public void preencherCEP(final String cep) {
        navegador.findElement(By.id("postal-code")).sendKeys(cep);
    }

    /**
     * <p>Continua para confirmacao do checkout.</p>
     * @see CheckoutConfirmacaoPagina
     */
    public void continuar() {
        navegador.findElement(By.id("continue")).click();
    }

}