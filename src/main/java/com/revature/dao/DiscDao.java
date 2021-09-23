package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
						rs.getInt("id")
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
		try(Connection conn = ConnectionUtil.getConnection()){
			
			ResultSet rs = null;
			
			String sql = "select * from discs where speed = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, speed);
			
			rs = ps.executeQuery();
			
			List<Disc> speedlist = new ArrayList<>();
			
			while(rs.next()) {
				 
				Disc d = new Disc(
						rs.getInt("disc_id"),
						rs.getString("disc_name"),
						rs.getInt("speed"),
						rs.getInt("glide"),
						rs.getInt("turn"),
						rs.getInt("fade"),
						rs.getString("plastic"),
						rs.getInt("id")
						);
				speedlist.add(d);
			}
			return speedlist;
			
		}catch(SQLException e) {
			System.out.println("Speed check failed");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void addDisc(Disc disc) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			
			String sql = "insert into discs (disc_name, speed, glide, turn, fade, plastic, id)" +
						 "values (?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, disc.getDisc_name());
			ps.setInt(2, disc.getSpeed());
			ps.setInt(3, disc.getGlide());
			ps.setInt(4, disc.getTurn());
			ps.setInt(5, disc.getFade());
			ps.setString(6, disc.getPlastic());
			ps.setInt(7, disc.getId());
			
			ps.executeUpdate();
			
			System.out.println(disc.getDisc_name() + " has been added to your bag!");
			
		}catch(SQLException e) {
			System.out.println("Add disc failed");
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeDisc(int id) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "delete from discs where disc_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			System.out.println("Goodbye forever disc " + id);
			
		}catch(SQLException e) {
			System.out.println("Remove disc failed!");
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateDiscPlastic(String disc_name, String plastic) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "update discs set plastic = ? where disc_name = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, plastic);
			ps.setString(2, disc_name);
			
			ps.executeUpdate();
			
			System.out.println(disc_name + " has a new plastic of " + plastic + "!");
		}catch(SQLException e) {
			System.out.println("Update disc failed!");
			e.printStackTrace();
		}
		
	}
	
	

}
