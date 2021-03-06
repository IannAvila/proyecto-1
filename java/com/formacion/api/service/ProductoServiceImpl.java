package com.formacion.api.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.api.entity.Producto;
import com.formacion.api.repository.ProductoDao;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> mostrarTodos() {
	
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto mostrarPorId(Long id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto guardar(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public void borrar(Long id) {
		productoDao.deleteById(id);
		
	}


}
