package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDAO;
import br.com.zavala.domain.jpa.ProdutoJpa;

/**
 * 
 * @author Ramiro
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}
}
