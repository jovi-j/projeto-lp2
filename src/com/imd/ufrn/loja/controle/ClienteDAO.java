package com.imd.ufrn.loja.controle;
import com.imd.ufrn.loja.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	List<Cliente> clientesCadastrados = new ArrayList<Cliente>();
	
	public void cadastrarCliente(Cliente c) {
		this.clientesCadastrados.add(c);
	}
	
	public Cliente getClienteByCPF(String cpf) {
		for (Cliente cliente : clientesCadastrados) {
			if(cliente.getCpf().equals(cpf)) {
				return cliente;
			}
		}
		return null;
	}
	
	public void getInformacoesClienteByCPF(String cpf) {
		for (Cliente cliente : clientesCadastrados) {
			if(cliente.getCpf().equals(cpf)) {
				cliente.getInformacoesCliente();
			}
		}
	}
	
}
