package connections;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class conexion {
	
	private static final String PERSITENCE_UNIT_NAME="miUnidad";
	
	private static EntityManagerFactory entityManagerFactory;
	
	public static EntityManager getEntityManager() {
		
		if(entityManagerFactory == null) {
		    entityManagerFactory = Persistence.createEntityManagerFactory(PERSITENCE_UNIT_NAME);
		}
		return entityManagerFactory.createEntityManager();
	}
	
	public static void closeEntityManagerFactory() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}

}
