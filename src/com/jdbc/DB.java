package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) {
		DB.getConnect();
	}
	
	public static Connection getConnect()
	{
		Connection conn=null;
		Statement stmt=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "tour", "tour");
			System.out.println("Connected");
			/*Statement stmt=con.createStatement();
			//ResultSet rs=stmt.executeQuery()
			stmt.executeUpdate("INSERT INTO  " +
                   "VALUES ()";)*/
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}return conn;
	}

}
