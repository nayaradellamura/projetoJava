package com.example.demo.repositorio.servico;
import com.example.demo.Inquilino;
import com.example.demo.repositorio.InquilinoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InquilinoServico {
	
	@Autowired
	private InquilinoRepositorio inquilinoRepositorio;
	
	public Inquilino gravar(Inquilino inquilino) {
		return inquilinoRepositorio.save(inquilino);
	}
}
