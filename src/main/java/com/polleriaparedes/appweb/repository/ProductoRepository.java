package com.polleriaparedes.appweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.polleriaparedes.appweb.model.Producto;
@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
}