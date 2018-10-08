package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity 

public class Contacts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private Long id;
	
	private String Nom;
	private String Prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance; 
	
	private String Email;
	private int tel;
	private String photo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(String nom, String prenom, Date dateNaissance, String email, int tel, String photo) {
		super();
		Nom = nom;
		Prenom = prenom;
		this.dateNaissance = dateNaissance;
		Email = email;
		this.tel = tel;
		this.photo = photo;
	}
	
	
	

}
