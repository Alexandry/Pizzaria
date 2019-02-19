package br.com.alexandre.financas.teste;

import javax.persistence.EntityManager;

import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.util.JPAUtil;

public class TestBuscaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		Conta conta  = em.find(Conta.class, 1);// Realizando select na base
		
		System.out.println("Nome: "+ conta.getTitular());
		em.getTransaction().commit();
		
	}

}
