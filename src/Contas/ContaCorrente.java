package Contas;

public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, String titular, int numero) {
		super(saldo, titular, numero);
	}
	
	public double getValorImposto() {
		return 0.01 * super.getSaldo();
	}
	
	
}
