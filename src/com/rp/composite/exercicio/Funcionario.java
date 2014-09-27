package com.rp.composite.exercicio;

public abstract class Funcionario {
	
	private final String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}



	public abstract void exibirSubordinados();
	
}
