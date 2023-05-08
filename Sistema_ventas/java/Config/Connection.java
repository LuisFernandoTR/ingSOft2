package Config;

import java.sql.*;


public class Connection {
	Connection con;
	String url = "jdbc:mysql://localhost::3306/db_ventas";
	String user = "root";
	String pass = "12345678";
	public Connection Connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass); 
		}catch(Exception e) {
			
		}
		return con;
	}
}
