package com.Insertrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentInsertRecord {
 public static void main(String [] args) throws ClassNotFoundException,SQLException
 {
	 Class.forName("com.mysql.jdbc.Driver");
	 
	 Connection con = DriverManager.getConnection("D:\\Desktop\\mysql-connector-j-8.4.0");
	 System.out.println(con);
	 
	 String query = "insert into student values(101,'Sayali',96.90)";
	 Statement st = con.createStatement();
	 
	 int rows = st.executeUpdate(query);
	 
	 System.out.println(rows);
	 con.close();
	 st.close();
}
}