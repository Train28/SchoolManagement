package model;

import java.sql.*;

import controller.Conexion;

public class SubjectManagement extends Conexion{
	
	
	Connection conn = getConexion();
	
	
	public void insertSubject(int id_number_subject,String name_subject) {
		
		Subject sub = new Subject(id_number_subject, name_subject);
		
		try {
			
		
		String sql = "insert into subject (id_number_subject,name_subject) values (?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, sub.getIdSubject());
		stmt.setString(2, sub.getNameSubject());
		
		stmt.execute();	
		System.out.println("Registro exitoso");
		
		} catch (Exception e) {
			System.out.println("Error "+ e);
		}
		
		
	}
	
	
	
	
	
	

}
