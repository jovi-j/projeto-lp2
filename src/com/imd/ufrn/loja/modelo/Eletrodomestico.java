package com.imd.ufrn.loja.modelo;

import java.util.List;

public class Eletrodomestico extends Produto {
	private int watts;
	private int mesesGarantia;
	
	public Eletrodomestico(String nome, Double preco, String codBarras, int peso, List<Double> medidas, int watts,
			int mesesGarantia) {
		super(nome, preco, codBarras, peso, medidas);
		this.watts = watts;
		this.mesesGarantia = mesesGarantia;
	}
	
	public int getWatts() {
		return watts;
	}
	
	public void setWatts(int watts) {
		this.watts = watts;
	}
	
	public int getMesesGarantia() {
		return mesesGarantia;
	}
	
	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}
	
	
	

}
