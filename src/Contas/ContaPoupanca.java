package Contas;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldo, String titular, int numero) {
		super(saldo, titular, numero);
	}
	public double getValorImposto() {
		return 0;
	}
	
}
