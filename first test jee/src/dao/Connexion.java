package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
private static Connection conn;
	
	public static Connection getConnection(){
		if( conn != null )
			return conn;
		try{
			String url="jdbc:mysql://localhost:3306/dbetudiant";
			String user="root";
			String passwd="";
String driver="com.mysql.jdbc.Driver";
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("connexion ok");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return conn;
	}

}
