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
public class LoggerFactory extends AbstractLoggerFactory{
       
	protected boolean typeLogger;
	
	/**
	 * 
	 */
	public LoggerFactory(boolean typeLoggger) {
		super();    
		// TODO Auto-generated constructor stub
		this.typeLogger= typeLogger;
	}

	@Override
	public ILogger createLogger() {
		// TODO Auto-generated method stub
		if(typeLogger == true) {
			return new FileLogger();
		}else {
			return new ConsoleLogger();
		}
	}


}
