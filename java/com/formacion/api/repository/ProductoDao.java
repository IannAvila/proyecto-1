package com.formacion.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacion.api.entity.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long>{

}
