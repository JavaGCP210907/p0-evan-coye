package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Identity;
import com.revature.util.ConnectionUtil;

public class IdentityDao implements IdentityDaoInterface {

	@Override
	public void addBrand(Identity id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "insert into identifiers (disc_brand, disc_type)" +
						 "values (?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, id.getDisc_brand());
			ps.setString(2, id.getDisc_type());
			
			ps.executeUpdate();
			
			System.out.println("A " + id.getDisc_brand() + " " + id.getDisc_type() + " has been added to your disc identities!");
		}catch(SQLException e) {
			System.out.println("Add brand failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Identity> allIdentities() {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			ResultSet rs = null;
			
			String sql = "select * from identifiers";
			
			Statement s = conn.createStatement();
			
			rs = s.executeQuery(sql);
			
			List<Identity> idList = new ArrayList<>();
			
			while(rs.next()) {
				Identity i = new Identity(
						rs.getInt("ident_id"),
						rs.getString("disc_brand"),
						rs.getString("disc_type")
						);
				idList.add(i);
			}
			return idList;
		}catch(SQLException e) {
			System.out.println("There's something wrong with your database");
			e.printStackTrace();
		}
		return null;
	}

}
