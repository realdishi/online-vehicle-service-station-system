/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */

package com.VehicleServiceStation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnectionUtil {
	
	private static Connection conn;
	
	private DBConnectionUtil() {
		
	}
	
	/**
	 * CREATE DATABASE CONNECTION
	 * 
	 * @return SQL CONNECTION FOR MICROSOFT SQL SERVER DATABASE
	 * @throws SQLExecption
	 * @throws ClassNotFoundException
	 */
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		/*
		 * CREATE NEW CONNECTION WHEN CONNECTION IS CLOSED OR NULL
		 */
		
		if( conn == null || conn.isClosed() )
		{
			Class.forName(properties.getProperty(QueryConstants.DRIVER_NAME));
			conn = DriverManager.getConnection(properties.getProperty(QueryConstants.URL),
					properties.getProperty(QueryConstants.USERNAME),
					properties.getProperty(QueryConstants.PASSWORD));
					
		}
	}

}
