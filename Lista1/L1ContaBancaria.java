package Lista1;

public class L1ContaBancaria {
    String numero;
    double saldo;
    String titular;

    // Construtor para inicializar a conta
    public L1ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido!");        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");        }
    }

    // Método para verificar o saldo
    public void verificarSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numero + " | Saldo atual: R$ " + saldo);
    }
}

public class MainConta {
    public static void main(String[] args) {
        // Criando uma instância da ContaBancaria
        L1ContaBancaria minhaConta = new L1ContaBancaria("12345-6", "Ana Silva", 500.0);

        // Verificando saldo inicial
        minhaConta.verificarSaldo();

        // Realizando um depósito
        minhaConta.depositar(200.0);
        minhaConta.verificarSaldo();

        // Realizando um saque
        minhaConta.sacar(150.0);
        minhaConta.verificarSaldo();
    }
    
}
