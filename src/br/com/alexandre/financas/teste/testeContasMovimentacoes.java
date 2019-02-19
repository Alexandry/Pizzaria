package br.com.alexandre.financas.teste;

import javax.persistence.EntityManager;

import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.model.Movimentacao;
import br.com.alexandre.financas.util.JPAUtil;

public class testeContasMovimentacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		em.getTransaction().begin();
		
		Movimentacao mov = em.find(Movimentacao.class, 2);
		Conta conta = mov.getConta();
		
		System.out.println(conta.getTitular());
		System.out.println(mov.getConta().getTitular());
		System.out.println(conta.getMovimentacao().size());
		
	}

}
