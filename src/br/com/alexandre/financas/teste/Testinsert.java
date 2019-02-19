package br.com.alexandre.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import br.com.alexandre.financas.model.TipoPizza;
import br.com.alexandre.financas.util.JPAUtilPizzaria;

public class Testinsert {

	@PersistenceContext(unitName="Pizzaria", type=PersistenceContextType.TRANSACTION)
	private static EntityManager em;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		em  = new JPAUtilPizzaria().getEntityMAnager();
		TipoPizza p = new TipoPizza();
		
		p.setNmPizza("teste 2");
		p.setValor(10);
		em.getTransaction().begin();
		
//		String sql = "insert into TipoPizza (cdpizza, NmTipoPizza,valor) "
//				+ "values (:pcdPizza, :pNmpizza, :pvalor) ";		
//		
//		Query query = em.createQuery(sql);
//		
//		query.setParameter("pcdPizza", p.getCdPizza());
//		query.setParameter("pNmpizza", p.getNmPizza());
//		query.setParameter("pvalor", p.getValor());
//		
		em.persist(p);
		
		em.getTransaction().commit();
		
		em.close();
			

	}

}
