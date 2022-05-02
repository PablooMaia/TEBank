public class ContaCorrente {
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
