package br.com.alexandre.financas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//Definindo a classe como entidade relacional
@Entity
public class Conta {
	//definindo chave primária
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Definicao de auto increment
	private int id;
	private String Nuconta;
	private String banco;
	private String agencia;
	private String titular;
	
	@OneToMany(mappedBy="conta") // Definindo relacionamento bidirecional entre as classes.
	private List<Movimentacao> movimentacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConta() {
		return Nuconta;
	}
	public void setConta(String conta) {
		this.Nuconta = conta;
	}
	
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public List<Movimentacao> getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentaco(List<Movimentacao> movimentacao) {
		this.movimentacao = movimentacao;
	}
	
	
	
}
