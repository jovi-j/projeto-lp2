package com.imd.ufrn.loja.modelo;

import java.util.List;

public class Decoracao extends Produto {
	
	private String cor;

	public Decoracao(String nome, Double preco, String codBarras, int peso, List<Double> medidas, String cor) {
		super(nome, preco, codBarras, peso, medidas);
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
