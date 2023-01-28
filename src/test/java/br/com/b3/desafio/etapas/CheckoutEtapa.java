package br.com.b3.desafio.etapas;

import static net.bytebuddy.utility.RandomString.make;

import br.com.b3.desafio.paginas.CarrinhoPagina;
import br.com.b3.desafio.paginas.checkout.CheckoutConfirmacaoPagina;
import br.com.b3.desafio.paginas.checkout.CheckoutInformacoesPagina;
import io.cucumber.java.en.Then;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CheckoutEtapa {

    // Injetados via PicoContainer:
    private final CarrinhoPagina carrinhoPagina;
    private final CheckoutInformacoesPagina checkoutInformacoesPagina;
    private final CheckoutConfirmacaoPagina checkoutConfirmacaoPagina;

    @Then("preencho as informacoes da compra.")
    public void preencho_as_informacoes_da_compra() {

        carrinhoPagina.realizarCheckout();

        checkoutInformacoesPagina.preencherNome(make());
        checkoutInformacoesPagina.preencherSobrenome(make());
        checkoutInformacoesPagina.preencherCEP(make());

        checkoutInformacoesPagina.continuar();

    }

    @Then("finalizo.")
    public void finalizo() {
        checkoutConfirmacaoPagina.finalizarCompra();
    }

}