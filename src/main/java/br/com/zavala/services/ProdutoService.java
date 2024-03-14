/**
 * 
 */
package br.com.zavala.services;

import br.com.zavala.dao.IProdutoDAO;
import br.com.zavala.domain.Produto;
import br.com.zavala.services.generic.GenericService;

/**
 * @author ramiro.zavala
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
