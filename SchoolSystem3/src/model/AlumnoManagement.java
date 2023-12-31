package model;

import java.sql.*;

import controller.Conexion;

public class AlumnoManagement {
	
	Conexion con = new Conexion();
	Connection conn = con.getConexion();

	
	public void insert(int id, String name, String address, int age, double pension) {
		
		Alumno al = new Alumno(id, name, address, age, pension);		
		
		try {
			String sql = "insert into student(id_student,name_student,address,age_student,pension)"
					+ "values(?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, al.getDni());
			stmt.setString(2, al.getName());
			stmt.setString(3, al.getAddress());
			stmt.setInt(4, al.getAge());
			stmt.setDouble(5, al.getPension());
			stmt.execute();
			System.out.println("Registro exitoso");
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}
		
	}

	
	public void delete(int id) {
		
		try {
			String sql = "delete from student where id_student ="+id;
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.execute();
			System.out.println("Borrado exitoso");
		} catch (Exception e) {
			System.out.println("Error :" + e);
		}
		
	}
	
	public void select() {
		try {
			String sql = "select * from student";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();			
			while (rs.next()) {
				int id = rs.getInt("id_student");
				String name = rs.getString("name_student");
				String address = rs.getString("address");
				int age = rs.getInt("age_student");
				double pension = rs.getInt("pension");				
				System.out.println(id + "|| " + name+"|| " + address+"|| " + age+"|| " + pension);
			}			
		} catch (Exception e) {
			System.out.println("Error " + e);
		}		
	}

	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("No implementado aun");
	}
	
	

}
