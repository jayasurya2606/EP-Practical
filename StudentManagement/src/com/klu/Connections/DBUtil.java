package com.klu.Connections;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtil {
	final static String forNameURL="com.mysql.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/studentbean";
	final static String username="root";
	final static String password="jayasurya12";
	public static Connection DBConnection() throws SQLException, ClassNotFoundException{
		Class.forName(forNameURL);
		Connection con=DriverManager.getConnection(dBURL,username,password);
		return con;
	}
}
