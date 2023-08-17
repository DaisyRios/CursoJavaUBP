package root;

import java.sql.SQLException;
import repository.LibroRepositorio;

public class Main {
	
	public static void main(String[] args) {
		LibroRepositorio librorepo = new LibroRepositorio();
		
	try {
		librorepo.TraergetLibrosporId(7);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
}
