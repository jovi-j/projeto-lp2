package com.imd.ufrn.loja.controle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.imd.ufrn.loja.modelo.Cliente;
import com.imd.ufrn.loja.modelo.Compra;
import com.imd.ufrn.loja.modelo.Produto;
import com.imd.ufrn.loja.modelo.Vendedor;

public class CompraDAO {
	private List<Compra> compraDB;
	
	public CompraDAO() {
		compraDB = new ArrayList<Compra>();
	}

	public void cadastrarCompra(Vendedor v, Cliente c, Produto p) {
		Compra compra = new Compra(v,c,p);
		this.compraDB.add(compra);
	}
	
	public void listarTodasCompras() {
		for (Compra compra : compraDB) {
			System.out.println(compra);
		}
	}
	
	public void listarComprasByCPF(String cpf) {
		for (Compra compra : compraDB) {
			if(compra.getComprador().getCpf().equals(cpf)) {
				System.out.println(compra);
			}
		}
	}
	
	public void listarVendasByIDVendedor(int idVendedor) {
		for (Compra compra : compraDB) {
			if(compra.getAtendente().getIdNum() == idVendedor) {
				System.out.println(compra);
			}
		}
	}
	
	public void listarVendasByData(Date dataCompare) {
		for (Compra compra : compraDB) {
			if(compra.getDataVenda() == dataCompare) {
				System.out.println(compra);
			}
		}
	}
}
