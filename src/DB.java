// imports

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection() {
		// init
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", ""); // con str
		} catch (Exception e) { // fail
			System.out.println(e);
		}
		return con;
	}

}
