package br.com.campanhas.dao;

import br.com.campanhas.domain.campanha;

public interface campanhaDao {

	public void incluir (campanha campanha);
	public void excluir (Long id);
	public campanha consultar(Long id, String nome);
	public campanha consultarId (Long id);
	
}
