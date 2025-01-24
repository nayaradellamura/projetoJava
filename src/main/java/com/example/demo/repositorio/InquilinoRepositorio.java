/**
 * 
 */
package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Inquilino;


public interface InquilinoRepositorio extends JpaRepository<Inquilino, Long> {

}

