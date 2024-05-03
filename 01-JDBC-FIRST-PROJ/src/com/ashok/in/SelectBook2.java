package com.ashok.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectBook2 {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME = "root";
	private static final String DB_PWD = "monu@1515";
	private static final String SELECT_SQL = "SELECT * FROM BOOKS WHERE BOOK_ID = 1003 ";

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(SELECT_SQL);
		if (rs.next()) {
			int id = rs.getInt("BOOK_ID");
			String name = rs.getString("BOOK_NAME");
			double price = rs.getDouble("BOOK_PRICE");
			System.out.println(id);
			System.out.println(name);
			System.out.println(price);
		} else {
			System.out.println("no record found");
		}
		con.close();

	}

}
