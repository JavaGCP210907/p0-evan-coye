package com.revature.models;

public class Disc {
	
	private int disc_id;
	private String disc_name;
	private int speed;
	private int glide;
	private int turn;
	private int fade; 
	private String plastic;
	private int id;
	
	
	
	
	//constructors 
	public Disc() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Disc(int disc_id, String disc_name, int speed, int glide, int turn, int fade, String plastic, int id) {
		super();
		this.disc_id = disc_id;
		this.disc_name = disc_name;
		this.speed = speed;
		this.glide = glide;
		this.turn = turn;
		this.fade = fade;
		this.plastic = plastic;
		this.id = id;
	}




	public Disc(String disc_name, int speed, int glide, int turn, int fade, String plastic, int id) {
		super();
		this.disc_name = disc_name;
		this.speed = speed;
		this.glide = glide;
		this.turn = turn;
		this.fade = fade;
		this.plastic = plastic;
		this.id = id;
	}




	@Override
	public String toString() {
		return "Disc [disc_id=" + disc_id + ", disc_name=" + disc_name + ", speed=" + speed + ", glide=" + glide
				+ ", turn=" + turn + ", fade=" + fade + ", plastic=" + plastic + ", id=" + id + "]";
	}




	public int getDisc_id() {
		return disc_id;
	}




	public void setDisc_id(int disc_id) {
		this.disc_id = disc_id;
	}




	public String getDisc_name() {
		return disc_name;
	}




	public void setDisc_name(String disc_name) {
		this.disc_name = disc_name;
	}




	public int getSpeed() {
		return speed;
	}




	public void setSpeed(int speed) {
		this.speed = speed;
	}




	public int getGlide() {
		return glide;
	}




	public void setGlide(int glide) {
		this.glide = glide;
	}




	public int getTurn() {
		return turn;
	}




	public void setTurn(int turn) {
		this.turn = turn;
	}




	public int getFade() {
		return fade;
	}




	public void setFade(int fade) {
		this.fade = fade;
	}




	public String getPlastic() {
		return plastic;
	}




	public void setPlastic(String plastic) {
		this.plastic = plastic;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + disc_id;
		result = prime * result + ((disc_name == null) ? 0 : disc_name.hashCode());
		result = prime * result + fade;
		result = prime * result + glide;
		result = prime * result + id;
		result = prime * result + ((plastic == null) ? 0 : plastic.hashCode());
		result = prime * result + speed;
		result = prime * result + turn;
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
		Disc other = (Disc) obj;
		if (disc_id != other.disc_id)
			return false;
		if (disc_name == null) {
			if (other.disc_name != null)
				return false;
		} else if (!disc_name.equals(other.disc_name))
			return false;
		if (fade != other.fade)
			return false;
		if (glide != other.glide)
			return false;
		if (id != other.id)
			return false;
		if (plastic == null) {
			if (other.plastic != null)
				return false;
		} else if (!plastic.equals(other.plastic))
			return false;
		if (speed != other.speed)
			return false;
		if (turn != other.turn)
			return false;
		return true;
	}

	


	
	
	
	

}
