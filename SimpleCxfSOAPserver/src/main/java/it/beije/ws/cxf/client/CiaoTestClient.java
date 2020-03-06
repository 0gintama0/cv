package it.beije.ws.cxf.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import it.beije.ws.cxf.server.Rubrica;

public class CiaoTestClient {

	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(Rubrica.class);
		factory.setAddress("http://localhost:8000/ciao");
		Rubrica client = (Rubrica) factory.create();
		String reply = client.ciao("CILACAP");
		System.out.println("Server said: " + reply);
		System.exit(0);
	}

}
