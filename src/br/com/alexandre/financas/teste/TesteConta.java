package br.com.alexandre.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.util.JPAUtil;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta =  new Conta();
		
		conta.setAgencia("8844");
		conta.setBanco("Itau");
		conta.setConta("205717");
		conta.setTitular("Alexandre A Lima");
		
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		//iniciando a trasacao
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit(); // commitando transacao
		
		em.close();//fechando conexao
		

	}

}
