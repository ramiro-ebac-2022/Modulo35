/**
 * 
 */
package br.com.zavala.services;

import br.com.zavala.domain.Cliente;
import br.com.zavala.exceptions.DAOException;
import br.com.zavala.services.generic.IGenericService;

/**
 * @author ramiro.zavala
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
