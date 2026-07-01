package banco.model;

public abstract class ContaBancaria {
    private int numeroConta;
    private Cliente cliente;
    protected double saldo;


    public ContaBancaria(int numeroConta, Cliente cliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

 
    public int getNumeroConta() { return numeroConta; }
    public Cliente getCliente() { return cliente; }
    public double getSaldo() { return saldo; }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

   
    public abstract void sacar(double valor);
    public abstract void transferir(ContaBancaria destino, double valor);

    @Override
    public String toString() {
        return "Conta [numero=" + numeroConta + ", cliente=" + cliente.getNome() + ", saldo=" + saldo + "]";
    }
}
