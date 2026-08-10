public class ContaBancaria {

    // Atributos
    int numero;
    double saldo;

    //Construtor

    public ContaBancaria(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
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

    // toString
    public String toString(){
        return ("Número da conta " + this.numero + "/ Saldo: " + this.saldo);
    }
}