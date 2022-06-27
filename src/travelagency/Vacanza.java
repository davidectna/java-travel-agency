package travelagency;

import java.time.LocalDate;

/*Nel progetto java-travel-agency, creare la classe Vacanza caratterizzata da:
- destinazione
- data inizio
- data fine
Quando viene creata una nuova Vacanza vanno effettuati dei controlli:
- destinazione, data inizio e data fine non possono essere null
- la data inizio non pu� essere gi� passata
- la data fine non pu� essere prima della data inizio
Se fallisce la validazione vanno sollevate opportune eccezioni
La classe Vacanza espone un metodo per calcolare la durata della vacanza (in giorni, mesi, anni).
Aggiungere una classe Agenzia con metodo main, dove chiediamo all�operatore se vuole inserire una 
nuova vacanza o uscire. Se vuole proseguire con l�inserimento va chiesta 
la destinazione, il giorno, mese e anno di partenza e il giorno, mese anno di ritorno.
Con questi dati va generata una nuova vacanza e in console verr� stampato un messaggio del tipo:
�Hai prenotato una vacanza di [durata della vacanza] a [destinazione] dal [data inizio formattata] al [data fine formattata]�.
Se la creazione della vacanza genera un errore, il programma non deve interrompersi ma va gestito 
con dei messaggi di errore che permettono all�utente di capire cosa � andato storto e di ripetere l�inserimento.*/

public class Vacanza {

	private String destination;
	private LocalDate startingDate;
	private LocalDate endingDate;
	
	private LocalDate today = LocalDate.now();
	
	public Vacanza (String destination,LocalDate startingDate,LocalDate endingDate) throws Exception{
		if ((startingDate == null) || (endingDate == null) || (destination == null)) {
			throw new Exception ("Non sono state inserite tutte le informazioni");
	    }else if (startingDate.isBefore(today)||(endingDate.isBefore(startingDate))) {
	    	throw new Exception ("Date inserite non valide");
	    }else {
	    	this.destination = destination;
	    	this.startingDate = startingDate;
	    	this.endingDate = endingDate;
	    }
		//piccola pausa 
	}
	
}

