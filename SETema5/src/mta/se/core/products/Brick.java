/**
 * 
 */
package mta.se.core.products;

import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This the brick material created by the materials factory.
 */
public class Brick implements IMaterial {

	/**
	 * The brick breaks if its quality is 50 or less
	 */
	@Override
	public void testResistance(int materialQuality) {
		
		if(materialQuality>100 || materialQuality <0)
			System.out.println("Unknown brick quality");
		
		if(materialQuality>50)
			System.out.println("This brick has good quality...cannot break it");
		else {
			System.out.println("This brick has poor quality...broke it with ease");
		}
		
	}
	
	@Override
	public void continueBuilding() {
		System.out.println("Using this brick to continue building...");
	}
	
	

}
