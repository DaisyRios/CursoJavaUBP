package root;

import java.util.Date;
import repository.AlumnoDao;
import models.Alumno;

public class Main {
	
public static void main (String[] args) {
	
	AlumnoDao alumnoDao = new AlumnoDao();
	Date fecha = new Date();
	Alumno alumno = new Alumno("tati", "tati@hotmail.com", fecha);
	
	alumnoDao.guardar(alumno);
	
	Alumno nuevoAlumno = alumnoDao.buscaPorId(2);
	
	System.out.println(nuevoAlumno.toString());
	
 }
}
//		EntityManager em;
//		
//		try {
//		em = conexion.getEntityManager();
//		System.out.println("Conexion exitosa");
//	} catch(Exception e) {	
//		System.out.println("Algo salio mal");
//		e.printStackTrace();
//	} finally {
//		conexion.closeEntityManagerFactory();
//		}
//	}
//}
