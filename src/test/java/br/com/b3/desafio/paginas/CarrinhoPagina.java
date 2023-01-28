package br.com.b3.desafio.paginas;

import org.openqa.selenium.By;

import br.com.b3.desafio.configuracoes.Navegador;
import br.com.b3.desafio.paginas.checkout.CheckoutInformacoesPagina;
import lombok.RequiredArgsConstructor;

/**
 * <p>Responsavel pelo carrinho.
 * {@linkplain https://www.saucedemo.com/cart.html}
 */
@RequiredArgsConstructor
public class CarrinhoPagina {

    // Injetado via PicoContainer.
    private final Navegador navegador;

    /**
     * <p>Realiza o checkout do carrinho.</p>
     * @see CheckoutInformacoesPagina
     */
    public void realizarCheckout() {
        navegador.findElement(By.id("checkout")).click();
    }

}