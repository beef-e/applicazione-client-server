import java.io.*;

public class Archivio {
	String fileName="archivio.txt";
	File mainDataBase= new File(fileName);

	public void creaFile(){
		try{
			mainDataBase.mkdirs();
			mainDataBase.createNewFile();
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}

	/**
	 * Il metodo aggiungiUtente permette di inserire i dati di un nuovo utente al File.
	 * @author Giammatia Biffi, Andrea Zotti*/
	public void aggiungiUtente(String stringaUtente){
		try{
			FileWriter fileWrite=new FileWriter(mainDataBase, true);
			PrintWriter writer=new PrintWriter(fileWrite);
			writer.println(stringaUtente);
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
