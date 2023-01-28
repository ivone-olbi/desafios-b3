package br.com.b3.desafio.paginas;

import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.b3.desafio.configuracoes.Navegador;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * <p>Responsavel pela lista de produtos.
 * {@linkplain https://www.saucedemo.com/inventory.html}
 */
@RequiredArgsConstructor
public class ProdutosPagina {

    @AllArgsConstructor
    public enum Ordem { Z_TO_A("za"); private String valor; }

    // Injetado via PicoContainer.
    private final Navegador navegador;

    /**
     * <p>Adiciona o {@code produto} no carrinho.</p>
     * @param produto {@link WebElement} que representa o produto
     */
    public void adicionarProdutoCarrinho(final WebElement produto) {
        produto.findElement(By.tagName("button")).click();
    }

    /**
     * <p>Retorna a lista de produtos.</p>
     * @return lista de {@link WebElement} que representam os produtos
     */
    public Collection<WebElement> listarProdutos() {
        return navegador.findElements(By.className("inventory_list"));
    }

    /**
     * <p>Ordena a lista de produtos.</p>
     */
    public void ordernarProdutos(final Ordem ordem) {
        navegador.findElement(By.className("product_sort_container")).sendKeys(ordem.valor);
    }

    /**
     * <p>Visualiza o carrinho.</p>
     */
    public void verCarrinho() {
        navegador.findElement(By.className("shopping_cart_link")).click();
    }

}