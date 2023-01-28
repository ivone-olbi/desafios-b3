package br.com.b3.desafio.paginas;

import org.openqa.selenium.By;

import br.com.b3.desafio.configuracoes.Navegador;
import lombok.RequiredArgsConstructor;

/**
 * <p>Responsavel pela pagina de login.
 * {@linkplain https://www.saucedemo.com}
 */
@RequiredArgsConstructor
public class LoginPagina {

    // Injetado via PicoContainer.
    private final Navegador navegador;

    /**
     * <p>Preencher o "input" chamado "Username" da pagina de login.</p>
     * @param usuario valor que sera preenchido
     */
    public void preencherUsuario(final String usuario) {
        navegador.findElement(By.id("user-name")).sendKeys(usuario);
    }

    /**
     * <p>Preencher o "input" chamado "Password" da pagina de login.</p>
     * @param senha valor que sera preenchido
     */
    public void preencherSenha(final String senha) {
        navegador.findElement(By.id("password")).sendKeys(senha);
    }

    /**
     * <p>Enviar os dados do formulario da pagina de login.</p>
     */
    public void realizarLogin() {
        navegador.findElement(By.id("login-button")).click();
    }

}