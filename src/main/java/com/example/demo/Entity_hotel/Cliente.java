package com.example.demo.Entity_hotel;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="cliente")
public class Cliente {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id_cliente")
	    private Long id_cliente;

	    public Cliente(String username_CL, String nome_cliente, String cognome_cliente,
				Date data_nascita, String password_CL) {
			this.username_CL = username_CL;
			this.nome_cliente = nome_cliente;
			this.cognome_cliente = cognome_cliente;
			this.data_nascita = data_nascita;
			this.password_CL = password_CL;
		}

		@Column(name="username_CL")
	    private String username_CL;

	    @Column(name="nome_cliente")
	    private String nome_cliente;
	    
	    @Column(name="cognome_cliente")
	    private String cognome_cliente;
	    
	    @Column(name="data_nascita")
	    private Date data_nascita;
	    
	    @Column(name="password_CL")
	    private String password_CL;

	    // Costruttori, getter e setter

	    public Cliente() {
	    }

		public Long getId_cliente() {
			return id_cliente;
		}

		public String getUsername_CL() {
			return username_CL;
		}

		public String getNome_cliente() {
			return nome_cliente;
		}

		public String getCognome_cliente() {
			return cognome_cliente;
		}

		public Date getData_nascita() {
			return data_nascita;
		}

		public String getPassword_CL() {
			return password_CL;
		}

		public void setId_cliente(Long id_cliente) {
			this.id_cliente = id_cliente;
		}

		public void setUsername_CL(String username_CL) {
			this.username_CL = username_CL;
		}

		public void setNome_cliente(String nome_cliente) {
			this.nome_cliente = nome_cliente;
		}

		public void setCognome_cliente(String cognome_cliente) {
			this.cognome_cliente = cognome_cliente;
		}

		public void setData_nascita(Date data_nascita) {
			this.data_nascita = data_nascita;
		}

		public void setPassword_CL(String password_CL) {
			this.password_CL = password_CL;
		}

	    //public Cliente (Long id_cliente, String username_CL) {
	      //  this.id_cliente = id_cliente;
	        //this.username_CL = username_CL;
	    //}
	
		
		
}

