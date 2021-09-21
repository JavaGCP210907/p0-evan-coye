package com.revature.dao;

import java.util.List;

import com.revature.models.Disc;

public interface DiscDaoInterface {
	
	public List<Disc> getDiscs ();// returns all discs 
	
	public List<Disc> getSpeed(int speed); // returns discs by speed
	
	public void addDisc(Disc disc); //adds new disc to database
	
	public void removeDisc(int id); // removes disc by disc_id
	
	public void updateDisc(int id); // updates a disc based on disc_id

}
