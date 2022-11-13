package com.imd.ufrn.loja.modelo;

import java.util.Date;

public class Compra {
	
	private Vendedor atendente;
	private Cliente comprador;
	private Produto produto;
	private Date dataVenda;
	
	public Compra(Vendedor atendente, Cliente comprador, Produto produto) {
		this.atendente = atendente;
		this.comprador = comprador;
		this.produto = produto;
		this.dataVenda = new Date();
	}

	public Vendedor getAtendente() {
		return atendente;
	}

	public void setAtendente(Vendedor atendente) {
		this.atendente = atendente;
	}

	public Cliente getComprador() {
		return comprador;
	}

	public void setComprador(Cliente comprador) {
		this.comprador = comprador;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	@Override
	public String toString() {
		return "*****************************\nCliente: " + comprador.getNome() + 
				" || Data da Compra: " + dataVenda + "\n" + produto +
				"\nVendedor: " + this.getAtendente().getNome() + " || Identificação do Vendedor: " + this.getAtendente().getIdNum() + 
				"\n*****************************\n";
		
	}
	
	

	
	
	

}
