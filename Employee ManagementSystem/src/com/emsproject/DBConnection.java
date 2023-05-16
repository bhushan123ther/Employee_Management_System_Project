package com.emsproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/employeeDB";
	public static final String USER = "root";
	public static final String PASS = "root";

	static Connection con = null;

	public static Connection getConnection() {
		try {

			Class.forName(JDBC_Driver);

			con = DriverManager.getConnection(JDBC_URL, USER, PASS);

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
