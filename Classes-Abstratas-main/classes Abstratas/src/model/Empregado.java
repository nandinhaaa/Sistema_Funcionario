package model;

public abstract class Empregado {
private String nome; 
private String fone;

	
public Empregado(String nome,String fone) {
	this.nome = nome;
	this.fone = fone; 
}

 public String getNome() {
	 return this.nome;
 }
 public void setNome(String nome) {
	 this.nome = nome; 
 }
 public String getFone() {
	 return this.fone;
 }
 public void setFone(String fone) {
	 this.fone = fone; 
 }
 //Metodo Abstrato 
 public abstract double salario(); //n�o tem implementa��o pois � abstrato
}
