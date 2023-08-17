package repository;

import javax.persistence.EntityManager;
import connections.conexion;
import models.Alumno;

public class AlumnoDao {
	
	EntityManager entity = conexion.getEntityManager();
	
	public AlumnoDao () {
	}
	
	public void guardar(Alumno alumno) {
		entity.getTransaction().begin();
		entity.persist(alumno);
		entity.getTransaction().commit();
//		conexion.closeEntityManagerFactory();
	}
	
public Alumno buscaPorId(Integer id) {
	 Alumno alumno = new Alumno();
	 alumno = entity.find(Alumno.class,id);
//	 conexion.closeEntityManagerFactory();
	 return alumno;
}

public void cerrarConexion() {
	conexion.closeEntityManagerFactory();
}
}


