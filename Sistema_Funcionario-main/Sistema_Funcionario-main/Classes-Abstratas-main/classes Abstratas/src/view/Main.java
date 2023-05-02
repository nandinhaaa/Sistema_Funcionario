package view;

import java.util.List;
import java.util.ArrayList;
import model.Comissionado;
import model.Gerente;
import model.Horista;
import model.Producao;
import model.CalculaSalario;

public class Main {
	public static void main(String[] args) {
	    Comissionado comissionado = new Comissionado("Maria Fernanda ", "99...", 5000, 50, 60);
	    Horista horista = new Horista("Amanda Mayara", "88...");
	    horista.setValorHora(80);
	    horista.setTotalHoras(100);
	    Producao producao = new Producao("Fernando", "99...");
	    producao.setValorUnidade(100);
	    producao.setQuantidadeProduzida(10);
	    Gerente gerente = new Gerente("Tulio", "77...", 20000);

	    // Criação de uma lista de empregados
	    List<CalculaSalario> empregados = new ArrayList<>();
	    empregados.add(comissionado);
	    empregados.add(horista);
	    empregados.add(producao);
	    empregados.add(gerente);

	   
	    double salarioTotal = 0;
	    for (CalculaSalario empregado : empregados) {
	        salarioTotal += empregado.salario();
	        System.out.println("Nome: " + empregado.getNome() + " - Tipo: " + empregado.getTipo() + " - Salário: " + empregado.salario());
	    }
	    System.out.println("Salário total: " + salarioTotal);
	}

}
