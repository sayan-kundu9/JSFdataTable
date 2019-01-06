package com.jsf.repo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.jsf.entity.Entity;

@ManagedBean
public class DatatableRepo {

	public List<Entity> list = new ArrayList<>();
	
	public List<Entity> findAllCountries(){
		
		list.add(new Entity("1", "India"));
		list.add(new Entity("2", "Pakistan"));
		list.add(new Entity("3", "Nepal"));
		list.add(new Entity("4", "Bhutan"));
		list.add(new Entity("5", "Bangladesh"));
		
		return list;
	}
}
