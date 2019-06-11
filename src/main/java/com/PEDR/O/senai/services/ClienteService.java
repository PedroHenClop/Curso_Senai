package com.PEDR.O.senai.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PEDR.O.demo.domain.Cliente;
import com.PEDR.O.demo.repositories.ClienteRepository;
import com.PEDRO.O.senai.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer IdCliente) {
		Optional<Cliente> obj = repo.findById(IdCliente);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Numero de id não encontrado. Id: " + IdCliente + ", tipo: "
				+ Cliente.class.getName()));
	} 
	
}
