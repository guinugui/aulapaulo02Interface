package Contas;

import Autentica.Tributavel;

public class TesteConta {

	public static void main(String[] args) {

		ContaPoupanca contaPoupanca = new ContaPoupanca(1000, "guigui", 1010);
		ContaCorrente contaCorrente = new ContaCorrente(1000, "guigui", 1111);
		SeguroDeVida seguroDeVida = new SeguroDeVida(1000, "Seguro de Vida", 343);

		System.out.println("Tributo Conta Poupança: " + contaPoupanca.getValorImposto());
		System.out.println("Tributo Conta Corrente: " + contaCorrente.getValorImposto());
		System.out.println("Tributo Seguro de Vida: " + seguroDeVida.getValorImposto());
	}

}
