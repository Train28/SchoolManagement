package view;

import controller.Conexion;
import model.*;
import java.sql.*;

import java.util.*;

public class main {

	public static void main(String[] args) {

		// Conexion c = new Conexion();
		System.out.println("Write the number u want to register");
		System.out.println("1. Subject" + "\n" + "2. Teacher");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();

		if (key == 1) {

		} else if (key == 2) {
			int idTeacher,age,teachingHours;
			String nameTeacher,address;
			double salary;
			TeacherManagement tm= new TeacherManagement();
			System.out.println("Write the number of the action u want to do");
			System.out.println(	"1. Insert new teacher" + "\n" + "2. Show all the teachers" 
			+ "\n" + "3. Delete teacher using ID");
			int p = sc.nextInt();

			switch (p) {
			case 1:
				System.out.println("Enter Id Number");
				 idTeacher = sc.nextInt();
				System.out.println("Enter name teacher");
				 nameTeacher = sc.next();
				System.out.println("Enter address");
				 address = sc.next();
				System.out.println("Enter age");
				 age = sc.nextInt();
				System.out.println("Enter salary");
				 salary = sc.nextDouble();
				System.out.println("Enter how many hours the teacher work");
				teachingHours = sc.nextInt();
				tm.insertTeacher(idTeacher, nameTeacher, nameTeacher, age, salary, teachingHours);
				break;
			case 2:
				tm.selectTeacher();

				break;
			case 3:
				System.out.println("Enter Id Number");
				idTeacher = sc.nextInt();
				tm.deleteTeacher(idTeacher);

				break;

			default:
				break;
			}
			
		} else {
			;
		}

		int idTeacher = sc.nextInt();
		String nameTeacher = sc.next();
		/*
		 * * String address = sc.next(); int age= sc.nextInt(); double salary =
		 * sc.nextDouble(); int teachingHours = sc.nextInt();
		 */

		/* Metodos para Subject(insertar) */
		SubjectManagement subm = new SubjectManagement();
		subm.insertSubject(idTeacher, nameTeacher);

		/*
		 * System.out.println("Create student"); Scanner sc = new Scanner(System.in);
		 * int idStudent= sc.nextInt(); String nameStudent=sc.next(); String address =
		 * sc.next(); int age= sc.nextInt(); double pension = sc.nextDouble();
		 * 
		 * 
		 * Alumno s = new Alumno(idStudent, nameStudent, address, age, pension);
		 * 
		 * try { c.getConexion();
		 * 
		 * 
		 * 
		 * String sql =
		 * "insert into student(id_student,name_student,address,age_student,pension)" +
		 * "values(?,?,?,?,?)"; PreparedStatement stmt =
		 * Conexion.con.prepareStatement(sql); stmt.setInt(1, s.getDni());
		 * stmt.setString(2, s.getName()); stmt.setString(3, s.getAddress());
		 * stmt.setInt(4, s.getAge()); stmt.setDouble(5, s.getPension());
		 * 
		 * stmt.execute(); System.out.println("Registro exitoso"); } catch (Exception e)
		 * { // TODO: handle exception }
		 */

		/*
		 * System.out.println("Create subject"); Scanner sc = new Scanner(System.in);
		 * 
		 * int idSubject= sc.nextInt(); String nameSubject=sc.next();
		 * 
		 * Subject sub = new Subject(idSubject, nameSubject);
		 * 
		 * try { c.getConexion(); String sql =
		 * "insert into subject(id_subject,name_subject)" + "values(?,? )";
		 * PreparedStatement stmt = Conexion.con.prepareStatement(sql); stmt.setInt(1,
		 * sub.getIdSubject()); stmt.setString(2, sub.getNameSubject());
		 * 
		 * stmt.execute(); System.out.println("Registro exitoso"); } catch (Exception e)
		 * { // TODO: handle exception }
		 */

		/*
		 * System.out.println("Create clase"); Scanner sc = new Scanner(System.in);
		 * 
		 * int idSubject= sc.nextInt(); String section=sc.next(); String
		 * time_class=sc.next(); int id_subject=sc.nextInt();
		 * 
		 * Clase cl= new Clase(idSubject, section, time_class, id_subject);
		 * 
		 * 
		 * try { c.getConexion(); String sql =
		 * "insert into class(id_class,section,time_class,id_number_subject)" +
		 * "values(?,?,?,? )"; PreparedStatement stmt =
		 * Conexion.con.prepareStatement(sql); stmt.setInt(1, cl.getId_class());
		 * stmt.setString(2, cl.getSection()); stmt.setString(3, cl.getTime_class());
		 * stmt.setInt(4, cl.getId_subject());
		 * 
		 * stmt.execute(); System.out.println("Registro exitoso"); } catch (Exception e)
		 * { // TODO: handle exception }
		 */

	}
}
