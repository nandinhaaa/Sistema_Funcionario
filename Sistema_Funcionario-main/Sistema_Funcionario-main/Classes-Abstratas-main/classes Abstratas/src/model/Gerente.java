package model;

public class Gerente extends Empregado implements CalculaSalario {
	private double salario;

	public Gerente (String nome,String fone,double salario) {
		super(nome,fone);
		this.salario = salario;
	}

	@Override 
	public double salario() {
		return salario; 
	}

	@Override
	public String getTipo() {
	    return "Gerente";
	}

}
