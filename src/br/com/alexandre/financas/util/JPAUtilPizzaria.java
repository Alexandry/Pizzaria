package br.com.alexandre.financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtilPizzaria {
	
	
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pizzaria");
	
	public EntityManager getEntityMAnager() {
		
		return emf.createEntityManager();
	}

}
