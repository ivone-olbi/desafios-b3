package br.com.b3.desafio.paginas.checkout;

import org.openqa.selenium.By;

import br.com.b3.desafio.configuracoes.Navegador;
import lombok.RequiredArgsConstructor;

/**
 * <p>Responsavel pela pagina de confirmacao do checkout.
 * {@linkplain https://www.saucedemo.com/checkout-step-two.html}
 */
@RequiredArgsConstructor
public class CheckoutConfirmacaoPagina {

    // Injetado via PicoContainer.
    private final Navegador navegador;

    /**
     * <p>Finalizar compra.</p>
     */
    public void finalizarCompra() {
        navegador.findElement(By.id("finish")).click();
    }

}