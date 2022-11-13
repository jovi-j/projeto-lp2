package com.imd.ufrn.loja.visao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.imd.ufrn.loja.controle.ClienteDAO;
import com.imd.ufrn.loja.controle.CompraDAO;
import com.imd.ufrn.loja.controle.ProdutoDAO;
import com.imd.ufrn.loja.controle.VendedorDAO;
import com.imd.ufrn.loja.modelo.Cliente;
import com.imd.ufrn.loja.modelo.Compra;
import com.imd.ufrn.loja.modelo.Decoracao;
import com.imd.ufrn.loja.modelo.Eletrodomestico;
import com.imd.ufrn.loja.modelo.Perecivel;
import com.imd.ufrn.loja.modelo.Pessoa;
import com.imd.ufrn.loja.modelo.Produto;
import com.imd.ufrn.loja.modelo.Vendedor;

public class Loja {

	public static void main(String[] args) {
		
		List<Double> medidasTeste = new ArrayList<Double>();
		
		medidasTeste.add(10.0);
		medidasTeste.add(10.0);
		medidasTeste.add(10.0);
		
		ProdutoDAO pDao = new ProdutoDAO();
		VendedorDAO vDao = new VendedorDAO();
		CompraDAO cDao = new CompraDAO();
		ClienteDAO clDao = new ClienteDAO();
		
		pDao.cadastrarProduto(new Perecivel("Feijão Preto", 9.50, "100010", 1, medidasTeste, new Date()));
		pDao.cadastrarProduto(new Eletrodomestico("Batedeira Mondial", 699.00, "502000", 5, medidasTeste, 100, 12));
		pDao.cadastrarProduto(new Decoracao("Cortina para quarto", 169.90, "300023", 1, medidasTeste, "Verde"));
		
		clDao.cadastrarCliente(new Cliente("José Maria", "123.456.789-01", new Date()));
		
		vDao.cadastrarVendedor(new Vendedor("Maria José", "124.453.799-02", new Date(), 1));
		
		cDao.cadastrarCompra(vDao.getVendedorById(1), clDao.getClienteByCPF("123.456.789-01"), pDao.getProdutoByCodBarras("300023"));
		
		pDao.listarProdutosComCategoria();
		
		cDao.listarTodasCompras();
		
		cDao.listarVendasByIDVendedor(1);
		
		
		

	}

}
