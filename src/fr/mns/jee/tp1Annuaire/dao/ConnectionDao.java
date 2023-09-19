package fr.mns.jee.tp1Annuaire.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDao {

	private static Connection connection = null;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		testJDBC();
	}

	public static Connection getInstance() throws SQLException, ClassNotFoundException {
		if(connection==null || connection.isClosed()) {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jsptest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
		}
		
		return connection;
	}
	
	
	
	
	public static void testJDBC() throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jsptest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "");
		Statement statement = connection.createStatement();

		String sql = "INSERT INTO person(lastname, firstname, birthdate, phoneNumber, gender) VALUES ('Test','John','1998-12-12','0601020305','male')";
		statement.executeUpdate(sql);
	}
}
