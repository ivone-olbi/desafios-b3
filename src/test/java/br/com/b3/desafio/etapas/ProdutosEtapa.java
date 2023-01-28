package br.com.b3.desafio.etapas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.WebElement;

import br.com.b3.desafio.paginas.ProdutosPagina;
import br.com.b3.desafio.paginas.ProdutosPagina.Ordem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProdutosEtapa {

    // Injetado via PicoContainer.
    private final ProdutosPagina produtosPagina;

    private WebElement produto;

    @Given("a lista de produtos.")
    public void a_lista_de_produtos() {
        assertFalse(produtosPagina.listarProdutos().isEmpty());
    }

    @When("ordeno os produtos {string}.")
    public void ordeno_os_produtos(final String ordem) {
        produtosPagina.ordernarProdutos(Ordem.valueOf(ordem));
    }

    @When("seleciono um produto.")
    public void seleciono_um_produto() {
        produto = produtosPagina.listarProdutos().iterator().next();
        assertNotNull(produto);
    }

    @When("entro no carrinho.")
    public void entro_no_carrinho() {
        produtosPagina.adicionarProdutoCarrinho(produto);
        produtosPagina.verCarrinho();
    }

}