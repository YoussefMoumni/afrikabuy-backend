package com.afrikabuy.entities;

import java.io.Serializable;

import javax.persistence.*;
    @Entity
    public class Product  implements Serializable {
    	private static final long serialVersionUID = 1L;
   
	@Id
	@GeneratedValue
	private int Id;
	private String Libelle;
	private String Type;
	private String Category;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	
}
