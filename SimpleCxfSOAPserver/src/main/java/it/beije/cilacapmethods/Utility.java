package it.beije.cilacapmethods;

import java.util.List;
import java.util.Scanner;

public class Utility {

	// Parte XML CSV standard Per Rubrica.
	@SuppressWarnings("resource")
	public static String choosePath(boolean csv_xml) { // false:csvFile, true:xmlFile estensione
		System.out.println();
		System.out.println("scegli il nome del file  -- !!digita solo il nome del file!!");
		Scanner infoPath = new Scanner(System.in);
		String nameFile = infoPath.nextLine();
		if (!csv_xml) {
			return ("csv/" + nameFile + ".csv");
		} else {
			return ("xml/" + nameFile + ".xml");
		}
	}

	public static void visualizzaRubrica(List<Contatto> listaContatti) {
		if (listaContatti.size() > 0) {
			for (int i = 0; i < listaContatti.size(); i++) {
				if (i == 0)
					System.out.println("..........................................");
				System.out.println("id: " + listaContatti.get(i).getId());
				System.out.println("nome: " + listaContatti.get(i).getNome());
				System.out.println("cognome: " + listaContatti.get(i).getCognome());
				System.out.println("telefono: " + listaContatti.get(i).getTelefono());
				System.out.println("email: " + listaContatti.get(i).getEmail());
				System.out.println("..........................................");
				System.out.println();
			} // fine for
		} // fine if
	}// fine metodo

	
	@SuppressWarnings("resource")
	public static Contatto inserisciContatto() { // riempie Bean da dare in pasto ai metodi
		Scanner scan = new Scanner(System.in);
		String fieldContatto = "campiDiContatto";
		Contatto c = new Contatto();
		System.out.println("inserisci un contatto:");
		System.out.println("............................");
		System.out.print("digita il nome:");
		fieldContatto = scan.nextLine();
		c.setNome(fieldContatto);
		System.out.print("\ndigita il cognome:");
		fieldContatto = scan.nextLine();
		c.setCognome(fieldContatto);
		System.out.print("\ndigita il telefono:");
		fieldContatto = scan.nextLine();
		c.setTelefono(fieldContatto);
		System.out.print("\ndigita la mail:");
		fieldContatto = scan.nextLine();
		c.setEmail(fieldContatto);
		System.out.println("............................");
		return c;

	}// fine metodo

	// ------------------------------------------------------------------------------------//

}
