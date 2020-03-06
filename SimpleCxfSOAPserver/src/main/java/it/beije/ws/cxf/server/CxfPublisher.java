package it.beije.ws.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class CxfPublisher {
	
	public static void main(String[] args) {
		System.out.println("Starting Server");
		Rubrica service = new RubricaImpl();
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setServiceClass(Rubrica.class);
		factory.setAddress("http://localhost:8000/ciao");
		factory.setServiceBean(service);
		factory.create();
	}
}
