package banco.model;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento; 

    public ContaPoupanca(int numeroConta, Cliente cliente, double saldoInicial, double taxaRendimento) {
        super(numeroConta, cliente, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
       
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            // Sem System.out.println, apenas altera o saldo.
        } else {
            // Pode lançar uma exceção ou apenas não fazer nada.
        }
    }

    @Override
    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        } 
    }
}
