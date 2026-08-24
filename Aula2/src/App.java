public class App {
    public static void main(String[] args) throws Exception {
        Lista1.L1ContaBancaria c1 = new Lista1.L1ContaBancaria("1234", "Titular", 0.0);

        c1.depositar(100);
        c1.sacar(30);

        // Chama o método em vez de acessar a variável diretamente
        c1.verificarSaldo();
    }
}