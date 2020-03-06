package it.beije.ws.cxf.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import it.beije.cilacapmethods.Contatto;

@WebService
public interface Rubrica {
	
    String ciao(@WebParam(name="name") String name);
    
    @WebMethod
    public List<Contatto> leggiContattiDaDB();
    
    @WebMethod
    public void scriviContattoInDB(Contatto contatto);
    
    @WebMethod
    public void modificaContattoInDB(Contatto contatto, Integer id);
    
    
    @WebMethod
    public void eliminaContattoInDB(Contatto contatto, Integer id);
    
}