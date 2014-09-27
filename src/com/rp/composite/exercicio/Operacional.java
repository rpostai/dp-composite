package com.rp.composite.exercicio;

public class Operacional extends Funcionario {

	public Operacional(String nome) {
		super(nome);
	}

	@Override
	public void exibirSubordinados() {
		System.out.println("Operacional:" + getNome());
	}

}
