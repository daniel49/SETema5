/**
 * 
 */
package mta.se.core.products;

import mta.se.core.productsinterfaces.IElectronic;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * 
 * This is the TV electronic created by the electronics factory.
 */
public class TV implements IElectronic {

	/**
	 * This function tells you something
	 */
	@Override
	public void turnOn(String comment) {
		System.out.println("Turning on the TV..." + comment );
	}
	
	@Override
	public void turnOff() {
		System.out.println("Turned off the TV!");
	}
	
}
