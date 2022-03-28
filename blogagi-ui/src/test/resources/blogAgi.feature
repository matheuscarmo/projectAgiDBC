#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Pesquisar no BlogAgi
  I want to query articles on BlogAgi

  Scenario: Pesquisar Dados Invalidos
    Given que o usuario tem acesso ao blog "https://blogdoagi.com.br/"
    When for realizar pesquisa com dados invalidos
    Then nao devera retornar os artigos

  Scenario: Pesquisar Com Palavra Chave
    Given que o usuario tem acesso ao blog "https://blogdoagi.com.br/"
    When for realizar pesquisa com palavras chaves
    Then devera retornar os artigos relacionaddo a pesquisa das palavras chave

