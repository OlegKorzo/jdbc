package com.unicorn.korzo.jdbc;

import java.sql.*;
import java.util.Iterator;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "java", "java");
        
        
        
    	UtilSQL sql = new UtilSQL();
    	
//    	UtilSQL.conn.createStatement().execute("delete from profession");
//    	UtilSQL.conn.createStatement().execute("delete from human");
//    	UtilSQL.conn.commit();
	        
        HumanDAOImpl h = new HumanDAOImpl();
        ProfessionDAOImpl p = new ProfessionDAOImpl();

        
/*
        Profession priest = new Profession("priest");
        Profession doctor = new Profession("doctor");
        p.add(priest);
        p.add(doctor);
*/      
        Profession prof = new Profession();
        
        prof = p.findByName("priest");
        h.add(new Human(20, "Petya", prof));
        
        List<Human> l = h.findAll();
        
        l.forEach(System.out::println);
        
        UtilSQL.conn.close();      
        	
        
        
    }
    
}
