package com.rp.composite.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {
	
	private List<Funcionario> subordinados = new ArrayList<Funcionario>();

	public Gerente(String nome) {
		super(nome);
	}

	@Override
	public void exibirSubordinados() {
		System.out.println("Gerente:" + getNome());
		for (Funcionario f: subordinados) {
			f.exibirSubordinados();
		}
	}
	
	public void adicionarSubordinado(Funcionario f) {
		subordinados.add(f);
	}
	

}
