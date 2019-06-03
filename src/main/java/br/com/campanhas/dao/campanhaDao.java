package br.com.campanhas.dao;

import br.com.campanhas.domain.campanha;

public interface campanhaDao {

	public void incluir ();
	public void excluir ();
	public campanha consultar();
	public campanha consultarId (Long id);
	
}
