/**
 * 
 */
package mta.se.core.productsinterfaces;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the interface of the electronics
 */
public interface IElectronic {

	/**
	 * This function turns on the electronic device
	 * @param comment - a message that describes the action
	 */
	void turnOn(String comment);
	
	/**
	 * The function turns off the device
	 */
	void turnOff();
	
}
