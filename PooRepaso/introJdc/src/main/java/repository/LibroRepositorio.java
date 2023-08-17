package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import models.Libro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LibroRepositorio {
	
	final String DB_URL = "jdbc:sqlite:mi_base.db";
	private Connection conect;
	private Statement stm;
	private PreparedStatement sql;
	
	public LibroRepositorio() {
	}
	
	private void conectar() throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		this.conect = DriverManager.getConnection(DB_URL);
				
	}
	
	public void TraergetLibrosporId(int id) throws SQLException, ClassNotFoundException{
		conectar();
		Libro libro = new Libro();
		this.sql = this.conect.prepareStatement("SELECT * FROM LIBRO WHERE ID=?");
		sql.setInt(1,id);
		ResultSet result = sql.executeQuery();
		
		libro.setId(result.getInt("id"));
		libro.setTitulo(result.getString("titulo"));
		libro.setAutor(result.getString("Autor"));
		libro.setPrecio(result.getDouble("Precio"));
		
		System.out.println(libro.toString());
		
		this.conect.close();
		result.close();
	}
	

}
