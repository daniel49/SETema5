/**
 * 
 */
package mta.se.core.factories;

import mta.se.core.products.Freezer;
import mta.se.core.products.Stereo;
import mta.se.core.products.TV;
import mta.se.core.productsinterfaces.IElectronic;
import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the electronics factory. It can create TVs, freezers or stereos
 */
public class ElectronicFactory extends AbstractFactory {

	/**
	 * This is the electronics factory, can not return a material
	 */
	@Override
	public IMaterial getMaterial(String materialName) {
		return null;
	}
	
	/**
	 * The electronic factory returns a tv,freezer or stereo, depending on what the client wants
	 */
	@Override
	public IElectronic getElectronic(String electronicName) {
		if(electronicName==null)
			return null;
		else if(electronicName.equalsIgnoreCase("TV"))
			return new TV();
		else if(electronicName.equalsIgnoreCase("Freezer"))
			return new Freezer();
		else if(electronicName.equalsIgnoreCase("Stereo"))
			return new Stereo();
		else
			return null;
	}

}
