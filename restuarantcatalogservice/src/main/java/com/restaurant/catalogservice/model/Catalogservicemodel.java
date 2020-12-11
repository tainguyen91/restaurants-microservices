package com.restaurant.catalogservice.model; 

public class Catalogservicemodel {
	
	private String catalogName;
	private String catalogDescription;
	private int catalogRating;
	
	public Catalogservicemodel(String catalogName,String catalogDescription,int catalogRating) {
		this.catalogName=catalogName;
		this.catalogDescription=catalogDescription;
		this.catalogRating=catalogRating;
	}
	
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public String getCatalogDescription() {
		return catalogDescription;
	}
	public void setCatalogDescription(String catalogDescription) {
		this.catalogDescription = catalogDescription;
	}
	public int getCatalogRating() {
		return catalogRating;
	}
	public void setCatalogRating(int catalogRating) {
		this.catalogRating = catalogRating;
	}
	
	

}
