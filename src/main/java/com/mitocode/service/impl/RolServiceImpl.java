package com.mitocode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mitocode.model.Rol;
import com.mitocode.repo.IGenericRepo;
import com.mitocode.repo.IRolRepo;
import com.mitocode.service.IRolService;

@Service
public class RolServiceImpl extends CRUDImpl<Rol, Integer> implements IRolService {

	@Autowired
	private IRolRepo repo;
	
	@Override
	protected IGenericRepo<Rol, Integer> getRepo() {
		return repo;
	}

	@Override
	public Page<Rol> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}

	@Override
	public Integer getNextIdRol() {
		Integer rol = repo.nextIdRol();
		return rol + 1;
	}
	
	

}
