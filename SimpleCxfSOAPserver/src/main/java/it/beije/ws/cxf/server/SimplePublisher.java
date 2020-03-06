package it.beije.ws.cxf.server;

import javax.xml.ws.Endpoint;

public class SimplePublisher {
	
	public static void main(String[] args) {
		System.out.println("Starting Server");
		Rubrica service = new RubricaImpl();
		String address = "http://localhost:9000/Rubrica";
		Endpoint.publish(address, service);
	}
}
