package br.com.b3.desafio.etapas;

import static br.com.b3.desafio.configuracoes.Propriedades.propriedade;

import br.com.b3.desafio.paginas.LoginPagina;
import io.cucumber.java.en.Given;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginEtapa {

    // Injetado via PicoContainer.
    private final LoginPagina loginPagina;

    @Given("performance_glitch_user.")
    public void performance_glitch_user() {
        login("performance_glitch_user");
    }

    @Given("problem_user.")
    public void problem_user() {
        login("problem_user");
    }

    private void login(final String usuario) {
        loginPagina.preencherUsuario(usuario);
        loginPagina.preencherSenha(propriedade("swaglabs.login.senha"));
        loginPagina.realizarLogin();
    }

}