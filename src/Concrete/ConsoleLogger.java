/**
 * 
 */
package Concrete;

import Abstract.ILogger;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class ConsoleLogger implements ILogger {

	@Override
	public void log(String args, String texte) {
		// TODO Auto-generated method stub
		System.out.println("Console : " +texte);
	}

}
