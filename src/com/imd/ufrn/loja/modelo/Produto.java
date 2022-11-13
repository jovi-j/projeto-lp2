package com.imd.ufrn.loja.modelo;

import java.util.List;

public abstract class Produto {
	private String nome;
	private Double preco;
	private String codBarras;
	private int peso;
	private List<Double> medidas;
	
	public Produto(String nome, Double preco, String codBarras, int peso, List<Double> medidas) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
		this.peso = peso;
		this.medidas = medidas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public List<Double> getMedidas() {
		return medidas;
	}
	public void setMedidas(List<Double> medidas) {
		this.medidas = medidas;
	}
	
	@Override
	public String toString() {
		return "Nome do Produto: " + this.getNome() + " || Preço: R$ " + this.getPreco() +
				"\nMedidas do Produto (LxAxP) em centímetros: " + this.getMedidas().get(0) + "x" + this.getMedidas().get(1) + "x" + this.getMedidas().get(2) +
				"\nPeso: " + this.getPeso() + " Kg" + " || Cód. de Barras: " + this.getCodBarras();
	}

}
