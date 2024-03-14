/**
 * 
 */
package br.com.zavala.dao;

import br.com.zavala.dao.generic.IGenericDAO;
import br.com.zavala.domain.Venda;
import br.com.zavala.exceptions.DAOException;
import br.com.zavala.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author ramiro.zavala
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
