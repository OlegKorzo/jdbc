package com.unicorn.korzo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UtilSQL {
	static Connection  conn;
	static {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "java", "java");
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	
//	public UtilSQL() throws SQLException{
//		init();
//	}
//	
//	public void init() throws SQLException{
//		
//	}
	
	
	public void run(String sql){
		
		try{
			Connection  conn = this.conn;
		    conn.setAutoCommit(false);
		    
		    PreparedStatement st = null;	
			
			st = conn.prepareStatement(sql);
			st.execute();
			conn.commit();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void closeConnection(Connection conn) throws SQLException {
		UtilSQL.conn.close();
	}
		

}
