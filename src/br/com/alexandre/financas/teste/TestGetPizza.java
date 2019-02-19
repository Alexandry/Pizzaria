package br.com.alexandre.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.Query;

import br.com.alexandre.financas.model.Movimentacao;
import br.com.alexandre.financas.model.TipoPizza;
import br.com.alexandre.financas.util.JPAUtil;

public class TestGetPizza {
	
	public static void main(String[] args) {
		
		TipoPizza pizza = new TipoPizza();
		
		pizza.setCdPizza(1);
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		em.getTransaction().begin();
		
		String jpql = "Select p from TipoPizza p where p.id = :pPizza ";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pPizza", pizza.getCdPizza());
		
		List<TipoPizza> lista = query.getResultList();
		if (lista != null) {
			
		
		for (TipoPizza p : lista) {
			System.out.println("Id: "+ p.getCdPizza() );
			System.out.println("Nome da pizza: "+ p.getNmPizza());
			System.out.println("Valor:"+ p.getValor());
			
		}
	}else {
		
		System.out.println("Não existe dados.");
	}
		em.getTransaction().commit();
		
		em.close();
		
	}

}
