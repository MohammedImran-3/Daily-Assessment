package com.indium.Sample_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/user";
		String username = "root";
		String password = "0507";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM students");

			while (rs.next()) {
				System.out.println( rs.getString(1) +" " + rs.getString(2));
			}

			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
