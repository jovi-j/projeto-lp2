package com.imd.ufrn.loja.modelo;

import java.util.Date;

public class Vendedor extends Pessoa {
	
	private int idNum;
	

	public Vendedor(String nome, String cpf, Date dataNascimento, int idNum) {
		super(nome, cpf, dataNascimento);
		this.idNum = idNum;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	

}
