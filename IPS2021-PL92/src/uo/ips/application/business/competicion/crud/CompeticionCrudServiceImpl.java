package uo.ips.application.business.competicion.crud;

import uo.ips.application.business.BusinessException;
import uo.ips.application.business.competicion.CompeticionCrudService;
import uo.ips.application.business.competicion.CompeticionDto;

public class CompeticionCrudServiceImpl implements CompeticionCrudService {

	
	public CompeticionDto AņadirCompeticion(CompeticionDto competicion) throws BusinessException {
		return new AņadirCompeticion(competicion).execute();
		
	}

}
