1. Modelar uma classe para representar uma bola.

```mermaid
    classDiagram

    class Bola{
        - int x
        - int y
        - string cor
        - double tamanho
        - String cor
        - double tamanho
        - String material
        - double peso
        + void pingar(int altura):void
        + rolar (int dist):void
    }
```

2. Modelar uma classe para representar um carro.

```mermaid
    classDiagram

    class Carro{
        - string motor
        - string pneu
        - string banco
        - string volante
        - string embreagem
        - string freio
        - string marcha
        - string acelerador
        - string marca
        - string modelo
        + void andar(int distancia):
        + void parar(int tempo):
    }
```

3. Modelar uma classe para uma conta bancária 
``` mermaid
    classDiagram

    class Conta{
        - string nome
        - int datadenascimento
        - int cpf
        - int rg
        - int conta
        - int senha
        - int salario
        - string funcao
        - double saldo
        - string extrato
        - string endereco
        + void calcularsaldo (double valor): boolean
        + void deposito (double valor) : boolean
        + void transacao (int): boolean
        + void analisarscore (string analise) : boolean
    }
```
4. Modelar uma classe para representar uma Branch

``` mermaid
    classDiagram

    class Branch{
        - String name
        - String lastCommit
        - String repository
        + commit (string mensage) : boolean
        + push (string commit): booleaan
        + merge (Branch branch): boolean
    }


```