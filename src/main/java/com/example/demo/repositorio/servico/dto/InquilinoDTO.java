package com.example.demo.repositorio.servico.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class InquilinoDTO {
	
	@NotBlank(message = "O nome deve ser informado")
	@Size(min = 2, message = "O nome deve ter no mínimo 2 caracteres")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
