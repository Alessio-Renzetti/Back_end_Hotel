package com.example.demo.Controller_hotel;

import com.example.demo.dto_hotel.RispostaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Service_hotel.Service_F;
import com.example.demo.dto_hotel.Autenticazione_dto;

@Controller
//@RequestMapping(value="flavio")

public class Controller_F {
	@Autowired private Service_F service_F;
	
	@PostMapping("/registrati")
	@CrossOrigin(origins = "*")
	@ResponseBody
	private RispostaDTO registrazione(@RequestBody Autenticazione_dto autenticazione_dto) {
		
		RispostaDTO risposta = new RispostaDTO(service_F.registrazione(autenticazione_dto));
		return risposta;

	}
}
