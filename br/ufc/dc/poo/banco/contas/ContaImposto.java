package br.ufc.dc.poo.banco.contas;
 
public class ContaImposto extends ContaAbstrata {
	
	private double saldo;

	public ContaImposto (String numero){
		super(numero);
	}
	public void debitar(double valor){
		saldo = saldo - (valor + (valor * 0.001));
	}

}