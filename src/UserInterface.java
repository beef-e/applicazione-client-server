import java.util.Scanner;

public class UserInterface {
	public UserInterface() {

	}
	/**
	* Il metodo start() mi consente di mostrare a video l'interfaccia con cui interagirà l'utente
	 * @author Giammaria Biffi, Andrea Zotti, Gabriele Di Cosmo*/
	public void start(){

	}

	public void aggiuntaUtente(){
		Scanner input=new Scanner(System.in);
		System.out.println("Benvenuto in BancaPocchia. Sei pregato inserire il tuo nome: ");
		String nome=input.next();
		Utente.nome=nome;
		System.out.println("Ottimo, adesso sei pregato di inserire il tuo cognome");
		String cognome=input.next();
		Utente.cognome=cognome;
		System.out.println("Perfetto. Adesso crea una password");
		String password=input.next();
		Utente.password=password;
		Server.formattaDati(nome, cognome, password);
	}
}
