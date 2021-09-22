package com.revature.models;

public class Identity {
	
	private int id;
	private String disc_brand;
	private String disc_type;
	
	
	
	//Constructors 
	
	public Identity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Identity(int id, String disc_brand, String disc_type) {
		super();
		this.id = id;
		this.disc_brand = disc_brand;
		this.disc_type = disc_type;
	}





	public Identity(String disc_brand, String disc_type) {
		super();
		this.disc_brand = disc_brand;
		this.disc_type = disc_type;
	}



	@Override
	public String toString() {
		return "Identity [id=" + id + ", disc_brand=" + disc_brand + ", disc_type=" + disc_type + "]";
	}



	public int getId() {
		return id;
	}



	public void setIdent_id(int id) {
		this.id = id;
	}



	public String getDisc_brand() {
		return disc_brand;
	}



	public void setDisc_brand(String disc_brand) {
		this.disc_brand = disc_brand;
	}



	public String getDisc_type() {
		return disc_type;
	}



	public void setDisc_type(String disc_type) {
		this.disc_type = disc_type;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disc_brand == null) ? 0 : disc_brand.hashCode());
		result = prime * result + ((disc_type == null) ? 0 : disc_type.hashCode());
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identity other = (Identity) obj;
		if (disc_brand == null) {
			if (other.disc_brand != null)
				return false;
		} else if (!disc_brand.equals(other.disc_brand))
			return false;
		if (disc_type == null) {
			if (other.disc_type != null)
				return false;
		} else if (!disc_type.equals(other.disc_type))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
