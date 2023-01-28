package br.com.b3.desafio.etapas;

import static br.com.b3.desafio.configuracoes.Propriedades.propriedade;

import br.com.b3.desafio.configuracoes.Navegador;
import io.cucumber.java.en.Given;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaginaEtapa {

    // Injetado via PicoContainer.
    private final Navegador navegador;

    @Given("SWAGLABS")
    public void swaglabs() {
        navegador.get(propriedade("swaglabs.url"));
    }

}