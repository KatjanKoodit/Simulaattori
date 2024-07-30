package datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Luokka <code>JpaConn</code> .
 *
 * @author Eveliina, Juho, Katja, Sebastian
 * @version 1.0 (13.10.2022)
 */
public class JpaConn {

	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;

	/**
	 * Luo EntityManagerin, jos sita ei ole viela ja palauttaa EntityManagerin
	 * 
	 * @return em
	 */
	public static EntityManager getInstance() {

		if (em == null) {
			if (emf == null) {
				emf = Persistence.createEntityManagerFactory("DevPU");
			}
			em = emf.createEntityManager();
		}
		return em;
	}
}
