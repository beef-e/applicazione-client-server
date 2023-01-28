/**
*
 * La classe Server permette di creare un server e utilizzarlo per far comunicare L'utente con il database e ottenere
 * i dati richiesti
 * @version 1.0
 * @author Giammaria Biffi, Andrea Zotti, Gabriele Di Cosmo*/
public class Server {
	/**
	*
	 * L'attributo archivio crea una istanza della classe Archivio, in grado di gestire il file necessario allo
	 * storage dei dati*/
	static Archivio db=new Archivio();

	public static void formattaDati(String nome, String cognome, String password){
		String stringaUtente;
		stringaUtente=nome +","+cognome+","+password;
		db.aggiungiUtente(stringaUtente);
	}
}

