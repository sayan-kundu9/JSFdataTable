package com.jsf.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import com.jsf.entity.Entity;
import com.jsf.service.DatatableService;

@ManagedBean
public class DatatableController implements Serializable{

	@ManagedProperty("#{datatableService}")
	private DatatableService datatableService;
	
	public List<Entity> countryList = new ArrayList<>();
	
	private Entity selectedCountry;
	private List<Entity> selectedCountries;

	public Entity getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(Entity selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public List<Entity> getSelectedCountries() {
		return selectedCountries;
	}

	public void setSelectedCountries(List<Entity> selectedCountries) {
		this.selectedCountries = selectedCountries;
	}

	public List<Entity> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<Entity> countryList) {
		this.countryList = countryList;
	}

	public DatatableService getDatatableService() {
		return datatableService;
	}

	public void setDatatableService(DatatableService datatableService) {
		this.datatableService = datatableService;
	}
	
	@PostConstruct
	public void loadList(){
		this.countryList = datatableService.findAllCountries();
	}
	
	public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Country Selected", ((Entity) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("Country Unselected", ((Entity) event.getObject()).getId());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
}
