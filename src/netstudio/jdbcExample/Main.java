package netstudio.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	static final String DB_URL = "jdbc:sqlite:/C:\\Users\\pinzauti\\Desktop\\corsoJava\\sqlite\\sqlite-tools\\users.db";

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection(DB_URL);
			PreparedStatement prepareStatement = con.prepareStatement("SELECT * FROM users ");
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				System.out.println("name : " + executeQuery.getString("name"));
				System.out.println("email : " + executeQuery.getString("email"));
			}

			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
