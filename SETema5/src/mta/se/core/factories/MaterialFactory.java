/**
 * 
 */
package mta.se.core.factories;

import mta.se.core.products.Brick;
import mta.se.core.products.Cement;
import mta.se.core.products.Wood;
import mta.se.core.productsinterfaces.IElectronic;
import mta.se.core.productsinterfaces.IMaterial;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>This is the materials factory. It can create wood,bricks or cement.
 */
public class MaterialFactory extends AbstractFactory {

	/**
	 * The materials factory returns wood, bricks or cement, depending on what the client wants
	 */
	@Override
	public IMaterial getMaterial(String materialName) {
		if(materialName==null)
			return null;
		else if(materialName.equalsIgnoreCase("Wood"))
			return new Wood();
		else if(materialName.equalsIgnoreCase("Brick"))
			return new Brick();
		else if(materialName.equalsIgnoreCase("Cement"))
			return new Cement();
		else
			return null;
	}
	
	/**
	 * Can not return electronics from the materials factory
	 */
	@Override
	public IElectronic getElectronic(String electronicName) {
		return null;
	}

}
