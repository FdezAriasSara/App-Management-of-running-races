package uo.ips.application.business.atleta;

import uo.ips.application.business.BusinessException;

public interface AtletaCrudService {

	AtletaDto aņadirAtleta(AtletaDto atleta) throws BusinessException;
}
