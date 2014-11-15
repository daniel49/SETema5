/**
 * 
 */
package mta.se.core.products;

import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the cement material created by the materials factory.
 */
public class Cement implements IMaterial {
	
	/**
	 * The cement breaks if its quality is 20 or less
	 */
	@Override
	public void testResistance(int materialQuality) {
		
		if(materialQuality>100 || materialQuality <0)
			System.out.println("Unknown cement quality");
		
		if(materialQuality>20)
			System.out.println("This cement has good quality...cannot break it");
		else {
			System.out.println("This cement has poor quality...broke it with ease");
		}
		
	}
	
	@Override
	public void continueBuilding() {
		System.out.println("Using this cement to continue building...");
	}

}
