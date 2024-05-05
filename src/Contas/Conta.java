package Contas;

public abstract class Conta {

	private double saldo;
	private String titular;
	private int numero;
	
	public Conta(double saldo, String titular, int numero) {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double calcularRendimento() {
		return 0;
		
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void saca(double valor) {
		this.saldo = valor;
	}
}
