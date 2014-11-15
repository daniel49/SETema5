/**
 * 
 */
package mta.se.core.products;

import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * This is the wood material created by the materials factory
 */
public class Wood implements IMaterial {

	/**
	 * The material breaks if its quality is 80 or less
	 */
	@Override
	public void testResistance(int materialQuality) {
		
		if(materialQuality>100 || materialQuality <0)
			System.out.println("Unknown wood quality");
		
		if(materialQuality>80)
			System.out.println("This wood has good quality...cannot break it");
		else {
			System.out.println("This wood has poor quality...broke it with ease");
		}
		
	}

	@Override
	public void continueBuilding() {
		System.out.println("Using this wood to continue building...");
	}

	
}
