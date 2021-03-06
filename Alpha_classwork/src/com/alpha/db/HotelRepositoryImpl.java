package com.alpha.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alpha.entities.Hotel;

public class HotelRepositoryImpl extends RepositoryUtils implements HotelRepository {

	List<Hotel> hotelsList = new ArrayList<Hotel>();
	
	@Override
	public List<Hotel> selectAllHotels() 
	{
	  openConnection();
	  try 
	  {
		PreparedStatement pstmt = dbCon.prepareStatement(SQLQuery.selectAllHotels);
		
		ResultSet rs = pstmt.executeQuery();
	
		while(rs.next())
		{
			String hotelCity = rs.getString("city");
			String hotelName = rs.getString("hotelName");
			String hotelAddrs = rs.getString("hotelAddress");
			String hotelDescp = rs.getString("hotelDescp");
			String hotelPhone1= rs.getString("hotelPhone1");
			String hotelPhone2 = rs.getString("hotelPhone2");
			String hotelCost = rs.getString("hotelCost");
			String hotelRating = rs.getString("hotelRating");
			String hotelEmail = rs.getString("hotelEmail");
			
			Hotel h1 = new Hotel();
			
			h1.setHotelCity(hotelCity);
			h1.setHotelName(hotelName);
			h1.setHotelAddrs(hotelAddrs);
			h1.setHotelDesc(hotelDescp);
			h1.setHotelPhone1(hotelPhone1);
			h1.setHotelPhone2(hotelPhone2);
			h1.setHotelCost(hotelCost);
			h1.setHotelRating(hotelRating);
			h1.setHotelEmail(hotelEmail);
			
			hotelsList.add(h1);
		}
	  } 
	  catch (SQLException e)
	  {
		e.printStackTrace();
	  }
	  
	  return hotelsList;
	}

	@Override
	public List<Hotel> selectHotelsByCity(String hotelCity) {
		// TODO Auto-generated method stub
       return null;
	}

	@Override
	public Hotel selectHotel(String hotelName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel selectHotel(String hotelName, String hotelCity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Repository getRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
