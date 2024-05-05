package Contas;

public class SeguroDeVida {

	private double valor;
	private String titular;
	private int numeroApolice;

	public SeguroDeVida(double valor, String titular, int numeroApolice) {
		this.valor = valor;
		this.titular = titular;
		this.numeroApolice = numeroApolice;
	}
	
	public double getValorImposto() {
        return 42 + 0.02 * this.valor;
    }
	
	
}
