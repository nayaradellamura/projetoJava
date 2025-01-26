package com.example.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Inquilino;
import com.example.demo.repositorio.servico.InquilinoServico;
import com.example.demo.repositorio.servico.dto.InquilinoDTO;
import com.example.demo.repositorio.servico.dto.InquilinoResponseDTO;
import com.example.demo.repositorio.servico.dto.mapper.InquilinoMapper;

@RestController
@RequestMapping("/inquilino")
public class InquilinoControle {
	
	@Autowired
	private InquilinoServico inquilinoServico;
	
	@Autowired
	private InquilinoMapper inquilinoMapper;
	
	@PostMapping
	public ResponseEntity<InquilinoResponseDTO> salvar(@RequestBody InquilinoDTO inquilinoDTO){
		Inquilino inquilino = inquilinoMapper .toEntity(inquilinoDTO);
		Inquilino inquilinoGravado = inquilinoServico.gravar(inquilino);
		InquilinoResponseDTO inquilinoResponseDTO = inquilinoMapper.toDTO(inquilinoGravado);
		return ResponseEntity.status(HttpStatus.CREATED).body(inquilinoResponseDTO);
	}
	
	

}
