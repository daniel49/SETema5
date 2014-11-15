/**
 * 
 */
package mta.se.core.factories;

/**
 * @author Ilie Daniel
 * </p>Created on 14/11/2014
 * </p>Thiss class creates a ElectronicFactory or MaterialFactory, by user's choise
 */
public class FactoryProducer {

	/**
	 * 
	 * @param factoryType - the type of the factory:electronics or materials
	 * @return - the function returns a ElectronicFactory or MaterialFactory object, depending on user's choise
	 */
	public static AbstractFactory getFactory(String factoryType) {
		if(factoryType.equalsIgnoreCase("Electronics"))
			return new ElectronicFactory();
		else if(factoryType.equalsIgnoreCase("Materials"))
			return new MaterialFactory();
		else
			return null;
	}
}
