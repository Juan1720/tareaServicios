package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profesor;
import com.example.demo.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	private ProfesorRepository repo;
	
	@Override
	public List<Profesor> listar() {
		
		return repo.findAll();
	}

	@Override
	public Profesor obtenerID(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		repo.save(profesor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(profesor);
	}
	
	

}
