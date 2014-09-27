package com.rp.composite.exercicio;

public class Sistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente("Rodrigo");
		
		g.adicionarSubordinado(new Operacional("Luis"));
		
		g.exibirSubordinados();
	}
	

}
