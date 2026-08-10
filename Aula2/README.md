# Projeto: Conta Bancária

Criar uma classe simplês que represente o comportamento básico de uma conta bancária


```mermaid
classDiagram
    class ContaBancaria {
        - int numero
        - double saldo
        + boolean sacar(double valor)
        + boolean depositar(double valor)
    }
````