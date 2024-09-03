package com.example.demo.Service_hotel;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity_hotel.Cliente;
import com.example.demo.Repository.ClienteRepository;
import com.example.demo.dto_hotel.Autenticazione_dto;
import com.example.demo.dto_hotel.Registrazione_dto;

@Service

public class Service_F {
	@Autowired private ClienteRepository clienteRepository;
public String registrazione(Autenticazione_dto autenticazione_dto) {
	Cliente utente_da_registrare = clienteRepository.findByUsername(autenticazione_dto.getUsername());
	if (utente_da_registrare==null) {
		// username valido
		utente_da_registrare = new Cliente(autenticazione_dto.getUsername(), autenticazione_dto.getNome(),autenticazione_dto.getCognome(),
				autenticazione_dto.getData_di_nascita(),autenticazione_dto.getPassword() );
		clienteRepository.save(utente_da_registrare);
		return "Registrazione avvenuta";
	}
	else {

		return "Username già in uso";

	}

}
public String autenticazione(Registrazione_dto registrazione_dto) {
	// TODO Auto-generated method stub
	Cliente cliente = clienteRepository.findByUsernameAndPassword(registrazione_dto.getUsername(), registrazione_dto.getPassword());
	return null;
}
}
