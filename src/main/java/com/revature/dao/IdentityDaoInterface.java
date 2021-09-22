package com.revature.dao;

import java.util.List;

import com.revature.models.Identity;

public interface IdentityDaoInterface {
	
	public void addBrand(Identity id);// adds new brand and type to Identity table
	
	public List<Identity> allIdentities();
	
}