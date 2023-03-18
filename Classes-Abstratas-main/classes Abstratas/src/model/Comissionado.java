package model;

public class Comissionado extends Empregado{
	private double salarioFixo;
	private double comissao;
	private double vendas;

	public Comissionado (String nome, String fone, double salarioFixo, double comissao, int vendas) {
		
		super(nome, fone);
		this.salarioFixo = salarioFixo;
		this.comissao = comissao;
		this.vendas = vendas; 
	}

	@Override
		public double salario() {
		return salarioFixo + (comissao * vendas);
	}
}

