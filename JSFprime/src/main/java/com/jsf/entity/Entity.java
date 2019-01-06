package com.jsf.entity;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

public class Entity implements Serializable{
	
	public String id;
	public String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Entity(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Entity() {
		// TODO Auto-generated constructor stub
	}
}
