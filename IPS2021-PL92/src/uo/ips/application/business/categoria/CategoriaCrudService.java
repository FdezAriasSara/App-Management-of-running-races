package uo.ips.application.business.categoria;

import uo.ips.application.business.BusinessException;

public interface CategoriaCrudService {

	public void AņadirCategoria(CategoriaDto categoria, int idCompeticion)
			throws BusinessException;

	public CategoriaDto encontrarCategoriaPorId(int idCategoria)
			throws BusinessException;
}
