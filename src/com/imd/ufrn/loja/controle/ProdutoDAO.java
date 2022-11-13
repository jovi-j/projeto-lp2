package com.imd.ufrn.loja.controle;

import java.util.ArrayList;
import java.util.List;

import com.imd.ufrn.loja.modelo.Decoracao;
import com.imd.ufrn.loja.modelo.Eletrodomestico;
import com.imd.ufrn.loja.modelo.Perecivel;
import com.imd.ufrn.loja.modelo.Produto;

public class ProdutoDAO {
	List<Produto> produtosEmEstoque = new ArrayList<Produto>();
	
	public void cadastrarProduto(Produto p) {
		this.produtosEmEstoque.add(p);
	}
	
	public void listarProdutosComCategoria() {
		for (Produto produto : produtosEmEstoque) {
			if(produto instanceof Decoracao) {
				System.out.println("Decoração - " + produto.getNome() + " - Cód: " + produto.getCodBarras());
			}
			else if(produto instanceof Eletrodomestico) {
				System.out.println("Eletrodomestico - " + produto.getNome() + " - Cód: " + produto.getCodBarras());
			}
			else if(produto instanceof Perecivel) {
				System.out.println("Perecível - " + produto.getNome() + " - Cód: " + produto.getCodBarras());
			}
		}
	}
	
	public Produto getProdutoByCodBarras(String codBarras) {
		for (Produto produto : produtosEmEstoque) {
			if(produto.getCodBarras().equals(codBarras)) {
				return produto;
			}
		}
		return null;
	}
	
}
