package com.afrikabuy.entities;
import javax.persistence.*;
	@Entity
public class ProductsFolder {
	
	@Id
	@GeneratedValue
	private int Id;
	private String Libelle;
	
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
	
	
	

}
