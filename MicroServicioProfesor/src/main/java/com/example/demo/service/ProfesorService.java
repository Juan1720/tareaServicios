package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Profesor;



public interface ProfesorService {
	
	List<Profesor> listar();
	Profesor obtenerID(Integer id);
	void guardar(Profesor profesor);
	void eliminar(Integer id);
	void actualizar(Profesor profesor);

}
