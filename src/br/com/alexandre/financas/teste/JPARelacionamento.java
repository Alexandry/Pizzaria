package br.com.alexandre.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.model.Movimentacao;
import br.com.alexandre.financas.model.TipoMovimentacao;
import br.com.alexandre.financas.util.JPAUtil;

public class JPARelacionamento {

	public static void main(String[] args) {
		
		Movimentacao mov = new Movimentacao();
		Conta conta = new Conta();
		
		conta.setAgencia("8451");
		conta.setBanco("341 - ITAU");
		conta.setConta("20571-7");
		conta.setTitular("Alexandre Assis de Lima");
		
		
		mov.setData(Calendar.getInstance());
		mov.setValor(new BigDecimal("22.50"));
		mov.setDescricao("Burguer King SA");
		mov.setTipo(TipoMovimentacao.SAIDA);
		mov.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		em.persist(mov);
		
		em.getTransaction().commit();
		
		em.close();

	}

}
