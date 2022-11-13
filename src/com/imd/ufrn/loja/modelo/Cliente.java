package com.imd.ufrn.loja.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

	List<Compra> comprasEfetuadas;
	Date dataCadastro;
	
	

	public Cliente(String nome, String cpf, Date dataNascimento) {
		super(nome, cpf, dataNascimento);
		this.comprasEfetuadas = new ArrayList<Compra>();
		this.dataCadastro = new Date();
	}

	public List<Compra> getComprasEfetuadas() {
		return comprasEfetuadas;
	}
	
	public void setComprasEfetuadas(List<Compra> comprasEfetuadas) {
		this.comprasEfetuadas = comprasEfetuadas;
	}
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public void associarCompra(Compra compra) {
		this.comprasEfetuadas.add(compra);
	}
	
	public void getInformacoesCliente() {
		System.out.println("********** DADOS DO CLIENTE *************");
		System.out.println("Nome:" + this.getNome() + " CPF:" + this.getCpf() + "Data de Nascimento:" + this.getDataNascimento());
		System.out.println("Nª de Compras Efetuadas:" + this.getComprasEfetuadas().size() + " Cliente desde:" + this.getDataCadastro());
		System.out.println("********** COMPRAS EFETUADAS PELO CLIENTE *************");
		for (Compra compra : comprasEfetuadas) {
			System.out.println(compra);
		}
	}
}
