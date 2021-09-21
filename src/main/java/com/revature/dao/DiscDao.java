package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Disc;
import com.revature.util.ConnectionUtil;

public class DiscDao implements DiscDaoInterface {

	@Override
	public List<Disc> getDiscs() {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			ResultSet rs = null;
			
			String sql = "select * from discs";
			
			Statement s = conn.createStatement();
			
			rs = s.executeQuery(sql);
			
			List<Disc> disclist = new ArrayList<>();
			
			while(rs.next()) {
				
				Disc d = new Disc(
						rs.getInt("disc_id"),
						rs.getString("disc_name"),
						rs.getInt("speed"),
						rs.getInt("glide"),
						rs.getInt("turn"),
						rs.getInt("fade"),
						rs.getString("plastic"),
						rs.getInt("ident_id")
						);
				
				disclist.add(d);
			}
			
			return disclist;
		}catch(SQLException e) {
			System.out.println("Something is wrong with your database");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Disc> getSpeed(int speed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDisc(Disc disc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDisc(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDisc(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
