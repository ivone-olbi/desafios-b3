@PaginaEtapa @LoginEtapa @ProdutosEtapa @CheckoutEtapa
Feature: Realizar compra.

  Background:
    Given SWAGLABS

  Scenario: Compra realizada com sucesso.
    Given <usuario>.
      And a lista de produtos.
     When ordeno os produtos "Z_TO_A".
      And seleciono um produto.
      And entro no carrinho.
     Then preencho as informacoes da compra.
      And finalizo.

    Examples: 
      | usuario                 |
      | performance_glitch_user |
      | problem_user            |