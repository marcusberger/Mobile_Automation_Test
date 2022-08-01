#language: pt
#Author: Marcus Berger
#Data 01/08/2022
Funcionalidade: Operações Matematicas

  @soma @Test
  Cenario: Soma de dois numeros inteiros
    Dado que o usuario esteja na calculadora
    Quando o usuario clicar o valor "5"
    E digitar a operacao de soma
    E clicar o valor "3"
    E clicar no igual
    Entao o resultado apresentado devera ser "8"

  @subtracao @Test
  Cenario: Subtracao de numeros inteiros
    Dado que o usuario esteja na calculadora
    Quando o usuario clicar o valor "5"
    E digitar a operacao de subtracao
    E clicar o valor "3"
    E clicar no igual
    Entao o resultado apresentado devera ser "2"

  @multiplicacao @Test
  Cenario: Multiplicacao de dois numeros inteiros
    Dado que o usuario esteja na calculadora
    Quando o usuario clicar o valor "5"
    E digitar a operacao de multiplicacao
    E clicar o valor "3"
    E clicar no igual
    Entao o resultado apresentado devera ser "15"