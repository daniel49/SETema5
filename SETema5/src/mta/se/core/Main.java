/**
 * 
 */
package mta.se.core;

import mta.se.core.factories.AbstractFactory;
import mta.se.core.factories.FactoryProducer;
import mta.se.core.factories.MaterialFactory;
import mta.se.core.factories.ElectronicFactory;
import mta.se.core.productsinterfaces.IElectronic;
import mta.se.core.productsinterfaces.IMaterial;
import mta.se.core.products.Brick;
import mta.se.core.products.Cement;
import mta.se.core.products.Wood;
import mta.se.core.products.TV;
import mta.se.core.products.Freezer;
import mta.se.core.products.Stereo;
/**
 * @author Ilie Daniel
 * </p>Create on 14/11/2014
 */
public class Main {

	/**
	 * @param args - The parameters given from command line
	 */
	public static void main(String[] args) {
		
		// Creating a materials factory
		AbstractFactory materialsFactory = FactoryProducer.getFactory("materials");
		// The materials factory produces wood
		IMaterial wood = materialsFactory.getMaterial("wood");
		// Testing the wood's resistance
		wood.testResistance(81);
		// The materials factory produces a brick
		IMaterial brick = materialsFactory.getMaterial("brick");
		// Testing the brick's resistance
		brick.testResistance(30);
		// The materials factory produces cement
		IMaterial cement = materialsFactory.getMaterial("cement");
		// Testing the cement's resistance
		cement.testResistance(30);
		//Using the cement to continue building
		cement.continueBuilding();
		
		
		// Creating an electronics factory
		AbstractFactory electronicsFactory = FactoryProducer.getFactory("electronics");
		// The electronics factory produces a TV
		IElectronic tv = electronicsFactory.getElectronic("tv");
		// Turning on the TV...
		tv.turnOn("pleasant watching");
		// The electronics factory produces a freezer
		IElectronic freezer = electronicsFactory.getElectronic("freezer");
		// Turning on the freezer
		freezer.turnOn("Brr...");
		// The electronics factory produces a stereo
		IElectronic stereo = electronicsFactory.getElectronic("stereo");
		// Turning on the stereo
		stereo.turnOn("poor neighbours...");
		// Turning off the stereo
		stereo.turnOff();

	}

}
