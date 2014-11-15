/**
 * 
 */
package mta.se.core.factories;

import mta.se.core.productsinterfaces.IElectronic;
import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the abstract factory. It can represent either electronics or materials factory.
 */
public abstract class AbstractFactory {
	
	/**
	 * 
	 * @param materialName - the name of the material: wood, brick or cement
	 * @return - the function returns wood, brick or cement material
	 */
	public abstract IMaterial getMaterial(String materialName);
	
	
	/**
	 * 
	 * @param electronicName - the name of the electronic:tv, freezer or stereo
	 * @return - the function returns a tv, freezer or stereo electronic
	 */
	public abstract IElectronic getElectronic(String electronicName);
	
}
