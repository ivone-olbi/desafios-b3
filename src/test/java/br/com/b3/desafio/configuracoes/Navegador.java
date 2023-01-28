package br.com.b3.desafio.configuracoes;

import static java.lang.System.getProperty;
import static java.lang.System.setProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import lombok.experimental.Delegate;

public class Navegador {

    private static enum NavegadoresSuportados { CHROME }

    @Delegate
    private WebDriver navegador = configure();

    /*
     * Configuracao do navegador que sera utilizado nos testes.
     * Para utilizar um navegador a sua escolha, defina a propriedade {@code "selenium.navegador"} com um dos navegadores suportados: {@link NavegadoresSuportados}.
     * Ex.: -Dselenium.navegador=CHROME
     */
    private WebDriver configure() {

       final var navegador = NavegadoresSuportados.valueOf(getProperty("selenium.navegador"));

       switch(navegador) {
          case CHROME: chrome();
          default: return new HtmlUnitDriver();
       }

    }

    // Configuracao do "Chrome".
    private WebDriver chrome() {
        setProperty("webdriver.chrome.driver", getClass().getResource("/selenium/drivers/chromedriver.exe").getPath());
        return new ChromeDriver();
    }

}