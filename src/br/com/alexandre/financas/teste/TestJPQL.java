package br.com.alexandre.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.model.Movimentacao;
import br.com.alexandre.financas.model.TipoMovimentacao;
import br.com.alexandre.financas.util.JPAUtil;

public class TestJPQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta conta = new Conta();
		conta.setId(2);
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		em.getTransaction().begin();
		
		//Select é feito na classe, com base na OO
		String jpql  = "Select mov from Movimentacao mov "
				+ " join mov.categoria cat" // inner join
				+ " left join mov.conta conta" // left join 
				+ " where mov.conta = :pConta" +
		" and mov.tipo = :pTipo" +
		" order by mov.valor desc";
		
		Query query = em.createQuery(jpql);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		List<Movimentacao> lista = query.getResultList();
		
		for (Movimentacao movimentacao : lista) {
			System.out.println("Descrição: "+ movimentacao.getDescricao());
			System.out.println("Conta: "+ movimentacao.getConta().getId());
			System.out.println("Tipo:"+ movimentacao.getTipo());
			
		}
		
		em.getTransaction().commit();
		
		em.close();

	}

}
