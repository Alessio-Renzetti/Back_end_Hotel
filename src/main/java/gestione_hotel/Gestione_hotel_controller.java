package gestione_hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class Gestione_hotel_controller {	
	
	@Autowired private Gestione_hotel_controller  gestione_hotel_controller;
	
		@RequestMapping  (value="/home")
		public String info() {
		
		return "non so";
	
	
		}
	








}