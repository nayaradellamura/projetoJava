package com.example.demo.repositorio.servico.dto.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Inquilino;
import com.example.demo.repositorio.servico.dto.InquilinoDTO;
import com.example.demo.repositorio.servico.dto.InquilinoResponseDTO;

@Component
public class InquilinoMapper {
	
	@Autowired
	private ModelMapper mapper;
	
	public Inquilino toEntity(InquilinoDTO dto) {
		Inquilino entity = mapper.map(dto, Inquilino.class);
		return entity;
	}
	
	public InquilinoResponseDTO toDTO(Inquilino entity) {
		InquilinoResponseDTO dto = mapper.map(entity, InquilinoResponseDTO.class);
		return dto;
	}
	
	public List<InquilinoResponseDTO> toDTO(List<Inquilino> inquilinos){
		return inquilinos.stream()
				.map(inquilino -> toDTO(inquilino))
				.collect(Collectors.toList());
	}
}
