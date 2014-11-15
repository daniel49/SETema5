/**
 * 
 */
package mta.se.core.productsinterfaces;

/**
 * @author Ilie Daniel
 * </p> Created on 14/11/2014
 * </p> This is the interface of the materials
 */
public interface IMaterial {
	/**
	 * The function that tests the material's quality depending on its quality
	 * </p>
	 * @param materialQuality - a value from 0 to 100 describing the material's quality
	 */
	
	void testResistance(int materialQuality);
	/**
	 * The function uses the material created by the factory, and continues building...
	 */
	void continueBuilding();
}
