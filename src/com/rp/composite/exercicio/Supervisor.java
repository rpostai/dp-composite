package com.rp.composite.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Funcionario {
	
	private List<Funcionario> subordinados = new ArrayList<Funcionario>();

	public Supervisor(String nome) {
		super(nome);
	}

	@Override
	public void exibirSubordinados() {
		System.out.println("Gerente:" + getNome());
		for (Funcionario f: subordinados) {
			f.exibirSubordinados();
		}
	}

}
