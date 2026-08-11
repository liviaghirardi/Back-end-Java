public class ContaBancaria {

    // Atributos
    private int numero;
    private double saldo;

    //Construtor

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        saldo = 0;
    }

    
    //Metodos
    public boolean sacar(double valor){
        if (valor<=saldo) {
            saldo-=valor;
            return true; 
        }
        return false;
    }

    public boolean depositar(double valor){
        if (valor>=0) {
            saldo+=valor;
            return true;
            
        }
        return false;
    }

    // Gatters and Setters
    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero
    }

    public void SetNumero(int numero){
        this.numero = numero;
    }

    // toString
    public String toString(){
        return ("Número da conta " + this.numero + "/ Saldo: " + this.saldo);
    }
}