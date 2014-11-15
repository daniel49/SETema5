/**
 * 
 */
package mta.se.core.products;

import mta.se.core.productsinterfaces.IElectronic;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the freezer electronic created by the electronics factory.
 */
public class Freezer implements IElectronic{

	/**
	 * This function tells you something
	 */
	@Override
	public void turnOn(String comment) {
		System.out.println("Turning on the freezer..." + comment);
	}
	
	@Override
	public void turnOff() {
		System.out.println("Turned off the freezer!");
	}

}
