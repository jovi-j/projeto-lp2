package com.imd.ufrn.loja.modelo;

import java.util.Date;
import java.util.List;

public class Perecivel extends Produto{
	
	private Date dataVencimento;

	
	public Perecivel(String nome, Double preco, String codBarras, int peso, List<Double> medidas, Date dataVencimento) {
		super(nome, preco, codBarras, peso, medidas);
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
