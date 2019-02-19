package br.com.alexandre.financas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="tbTipoPizza")
@SequenceGenerator(name="CD_PIZZA", sequenceName = "Seq", initialValue = 2, allocationSize = 1)
public class TipoPizza {
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CD_PIZZA")
	@Id
	@Column(length=11)
	int cdPizza;
	
	@Column(name="NmTipoPizza", length=255)
	String NmPizza;
	
	@Column(name="Valor")
	double valor;
	
	
	

	public int getCdPizza() {
		return cdPizza;
	}
	public void setCdPizza(Integer cdPizza) {
		this.cdPizza = cdPizza;
	}
	public String getNmPizza() {
		return NmPizza;
	}
	public void setNmPizza(String nmPizza) {
		NmPizza = nmPizza;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	

}
