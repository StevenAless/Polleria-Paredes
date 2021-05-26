package com.polleriaparedes.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polleriaparedes.appweb.model.Usuario;
@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    
}