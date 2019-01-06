package com.jsf.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.jsf.entity.Entity;
import com.jsf.repo.DatatableRepo;

@ManagedBean
public class DatatableService {

	@ManagedProperty("#{datatableRepo}")
	private DatatableRepo datatableRepo;

	public DatatableRepo getDatatableRepo() {
		return datatableRepo;
	}

	public void setDatatableRepo(DatatableRepo datatableRepo) {
		this.datatableRepo = datatableRepo;
	}
	
	public List<Entity> findAllCountries(){
		return datatableRepo.findAllCountries();
	}
}
