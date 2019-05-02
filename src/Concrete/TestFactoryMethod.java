/**
 * 
 */
package Concrete;

import Abstract.AbstractLoggerFactory;
import Abstract.ILogger;

/**
 * @author IBRAHIMA IBNU OMAR
 *
 */
public class TestFactoryMethod {

	public static void main(String [] args) {
		
		AbstractLoggerFactory Factory = new LoggerFactory(false);
		ILogger logger = Factory.createLogger();
		logger.log(TestFactoryMethod.class.toString(),"BONJOUR TOUT LE MONDE");
		
	}
}
