package br.com.alexandre.financas.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.alexandre.financas.model.Categoria;
import br.com.alexandre.financas.model.Conta;
import br.com.alexandre.financas.model.Movimentacao;
import br.com.alexandre.financas.model.TipoMovimentacao;
import br.com.alexandre.financas.util.JPAUtil;

public class TesteMovimentacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categoria categoria = new Categoria("Viagens");
		Categoria categoria2 = new Categoria("Negocios");		
		
		Conta conta = new Conta();
		conta.setId(2);
		
		Movimentacao mov = new Movimentacao();		
		mov.setData(Calendar.getInstance());
		mov.setValor(new BigDecimal("350.89"));
		mov.setDescricao("Viagem a SP");
		mov.setTipo(TipoMovimentacao.SAIDA);
		mov.setCategoria(Arrays.asList(categoria, categoria2));
		mov.setConta(conta);
		
		Movimentacao mov2 = new Movimentacao();		
		mov2.setData(Calendar.getInstance());
		mov2.setValor(new BigDecimal("592.76"));
		mov2.setDescricao("Viagem a hortolandia");
		mov2.setTipo(TipoMovimentacao.SAIDA);
		mov2.setCategoria(Arrays.asList(categoria, categoria2));
		mov2.setConta(conta);
		
		
		EntityManager em = new JPAUtil().getEntityMAnager();
		
		em.getTransaction().begin();
		
		em.persist(categoria);
		em.persist(categoria2);
		
		em.persist(mov);
		em.persist(mov2);
		
		em.getTransaction().commit();
		
		
		em.close();

		

	}

}
