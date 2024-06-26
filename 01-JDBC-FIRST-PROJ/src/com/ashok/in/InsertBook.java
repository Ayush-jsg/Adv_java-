package com.ashok.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
	private static final String DB_UNAME = "root";
	private static final String DB_PWD = "monu@1515";
	private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES ( 103,'python',3000 )";

	
	public static void main(String[] args) throws Exception {

		// step-1 : Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		

		// Step-2 DB Connection
		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		// Step-3 create Statement
		Statement stmt = con.createStatement();

		// Step-4 Execute Query
		int rowEffected = stmt.executeUpdate(INSERT_SQL);

		// Step-5 process Result
		System.out.println(rowEffected);

		// Step-6 Close connection
		con.close();

	}

}



