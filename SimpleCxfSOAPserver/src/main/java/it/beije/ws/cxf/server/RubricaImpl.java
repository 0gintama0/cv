package it.beije.ws.cxf.server;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import it.beije.cilacapmethods.Contatto;

@WebService(
		endpointInterface = "it.beije.ws.cxf.server.Rubrica",
		serviceName = "Ciao"
	)
public class RubricaImpl implements Rubrica {
	
	@Override
	public String ciao(@WebParam(name = "name") String name) {
		System.out.println("say CIAO to " + name);
		return "CIAO " + name;
	}

	@Override
	public List<Contatto> leggiContattiDaDB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void scriviContattoInDB(Contatto contatto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificaContattoInDB(Contatto contatto, Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminaContattoInDB(Contatto contatto, Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
}