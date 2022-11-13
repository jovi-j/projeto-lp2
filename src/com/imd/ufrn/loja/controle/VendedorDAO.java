package com.imd.ufrn.loja.controle;

import java.util.ArrayList;
import java.util.List;

import com.imd.ufrn.loja.modelo.Vendedor;

public class VendedorDAO {
	
	List<Vendedor> vendedoresCadastrados;
	
	
	public VendedorDAO() {
		super();
		this.vendedoresCadastrados = new ArrayList<Vendedor>();
	}



	public void cadastrarVendedor(Vendedor v) {
		this.vendedoresCadastrados.add(v);
	}
	
	public Vendedor getVendedorById(int idVendedor) {
		for (Vendedor vendedor : vendedoresCadastrados) {
			if(vendedor.getIdNum() == idVendedor) {
				return vendedor;
			}
		}
		return null;
	}
	

}
