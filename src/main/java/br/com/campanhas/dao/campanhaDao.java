package br.com.campanhas.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class campanhaDao {
	@Column(name="nome")
	private String nome;
	
	@Column(name="idTime")
	private Integer idTime;
	
	@Column(name="dataInicio")
	private Date dataInicio;
	
	@Column(name="dataFim")
	private Date dataFim;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdTime() {
		return idTime;
	}
	public void setIdTime(Integer idTime) {
		this.idTime = idTime;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
