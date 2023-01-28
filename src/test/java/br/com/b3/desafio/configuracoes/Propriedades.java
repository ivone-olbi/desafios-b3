package br.com.b3.desafio.configuracoes;

import java.util.Properties;

import lombok.SneakyThrows;

/**
 * <p>Responsavel pela leitura do arquivo {@linkplain /application.properties}.
 */
public final class Propriedades {

    private static final Properties PROPERTIES = inicializarPropriedades();

    /**
     * <p>Retorna o valor da propriedade.</p>
     * @param nome propriedade
     */
    public static String propriedade(final String nome) {
        return PROPERTIES.getProperty(nome);
    }

    // Le o arquivo de propriedades e carrega a variavel {@code PROPERTIES}.
    @SneakyThrows
    private static Properties inicializarPropriedades() {

        final var properties = new Properties();
        properties.load(Propriedades.class.getResourceAsStream("/application.properties"));

        return properties;

    }

}