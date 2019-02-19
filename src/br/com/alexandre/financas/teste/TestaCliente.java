package br.com.alexandre.financas.teste;

import javax.persistence.EntityManager;

import br.com.alexandre.financas.model.Cliente;
import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.util.JPAUtil;

public class TestaCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Alexandre Lima");
		cliente.setProfissao("Analista de Sistemas");
		cliente.setEndereco("Rua Pitagoras, 543 - São Paulo");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Alexandre Lima");
		cliente2.setProfissao("Analista de Sistemas");
		cliente2.setEndereco("Rua Pitagoras, 543 - São Paulo");
		
		
		Conta conta = new Conta();
		conta.setId(1);
		cliente.setConta(conta);
		
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		em.persist(cliente2);
				
		em.getTransaction().commit();
		
		em.close();
		
	}

}
