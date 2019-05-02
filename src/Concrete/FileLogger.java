/**
 * 
 */
package Concrete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Abstract.ILogger;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class FileLogger implements ILogger {

	@Override
	public void log(String args, String texte) {
		// TODO Auto-generated method stub
		try {
			
			File file = new File("Fichier.text");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bufferWritter = new BufferedWriter(fileWriter);
			bufferWritter.write(texte);
			bufferWritter.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Message enregistré dans un fichier : "+texte);
		
	}
	

}
