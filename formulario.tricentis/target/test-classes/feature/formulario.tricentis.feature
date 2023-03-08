#Author: etalmani@gmail.com

@form
Feature: Formulario de cotacao automobile
  Como usuario
  Quero preencher o formulario de cotacao
  Para realizar a cotacao com sucesso


  Scenario: Cotacao automobile com informacoes corretas
    Given que entre no site da empresa tricentis para cotacao "http://sampleapp.tricentis.com/"
    And que clico na opcao desejada
    When preencho os dados do veiculo
    And preencho os dados do seguro
    And preencho os dados do produto
    And preencho os dados do preco
    And envio cotacao
    Then cotacao enviada com sucesso
  
