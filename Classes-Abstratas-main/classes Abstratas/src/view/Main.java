package view;

import model.Comissionado;
import model.Gerente;
import model.Horista;
import model.Producao;

public class Main {

	public static void main(String[] args) {
		Comissionado comissionado = new Comissionado("Maria Fernanda ", "99...",5000, 50, 60);
		
		Horista horista = new Horista("Amanda Mayara", "88..."); 
		horista.setValorHora(80);
		horista.setTotalHoras(100);
		
		Producao producao = new Producao ("Fernando", "99...");
		producao.setValorUnidade(100);
		producao.setQuantidadeProduzida(10);
		
		Gerente gerente = new Gerente ("Tulio", "77...", 20000);
		gerente.salario();
		
		System.out.println("Salário Comissionado");
		System.out.println(comissionado.getNome() + comissionado.salario());
		System.out.println();
		
		System.out.println("Salario Horista");
		System.out.println(horista.getNome() + " " + horista.salario()); 
		System.out.println();
		
		System.out.println("Salario Producao");
		System.out.println(producao.getNome() + " " + producao.salario());
		System.out.println();
		
		System.out.println("Salario Gerente");
		System.out.println(gerente.getNome() + " " + gerente.salario());
		System.out.println();
	
		
	}
	

}
