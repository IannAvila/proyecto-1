package com.formacion.api.service;

import java.util.List;

import com.formacion.api.entity.Producto;

public interface ProductoService {
	
	public List<Producto> mostrarTodos();
	
	public Producto mostrarPorId(Long id);
	
	public Producto guardar(Producto producto);
	
	public void borrar(Long id);

}
