public class App {

    public static void main(String [] args) throws Exception{
        ContaBancaria c1 = new ContaBancaria(1234,0);

        c1.numero = 1234;
        c1.saldo = 0.0;

        c1.depositar(100);
        c1.sacar(30);

        System.out.println(c1,getSaldo());
    }
}