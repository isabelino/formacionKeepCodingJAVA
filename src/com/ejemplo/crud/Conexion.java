package com.ejemplo.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static String databasename="test";
	public static String dbURL ="jdbc:mysql://localhost:3306/"+databasename;
	public static String username ="root";
	public static String password = "";
	
	public static Connection conexion() {
		
		Connection conect=null;
		
		try {
			 conect = DriverManager.getConnection(dbURL,username,password);
			
			if(conect != null) {
				System.out.println("Conexion exitosa");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conect;
	}
}
