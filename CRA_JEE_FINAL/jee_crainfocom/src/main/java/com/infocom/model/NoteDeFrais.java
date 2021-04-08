package com.infocom.model;


import java.util.Date;

public class NoteDeFrais{
	
	private int id;
	private String raison;
	private double prix;
	private Date date;
	private int idColl;
	
	public NoteDeFrais() {};
	
	public NoteDeFrais(int id, String raison, double prix, Date date,  int idColl) {
		this.id = id;
		this.raison = raison;
		this.prix = prix;
		this.date = date;
		this.idColl = idColl;
	}
	
	 public int getId() {
			return id;
		}
	 
	 public int setId(int id) {
			return this.id = id;
		}
	 
	 public String getRaison() {
		 return raison;
	 }
	 public String setRaison(String raison) {
		 return this.raison = raison;
	 }
	
	 public double getPrix() {
		 return prix;
	 }
	 public double setPrix(double prix) {
		 return this.prix = prix;
	 }
	 
	 public Date getDate() {
		 return date;
	 }
	 public Date setDate(Date date) {
		 return this.date = date;
	 }
	 
	 public int getIdColl() {
		 return idColl;
	 }
	 
	 public int setIdColl(int idColl) {
		 return this.idColl = idColl;
	 }

	@Override
	public String toString() {
		return "NoteDeFrais [id=" + id + ", raison=" + raison + ", prix=" + prix + ", date=" + date + ", idColl="
				+ idColl + "]";
	}

	
	 
	 
}
