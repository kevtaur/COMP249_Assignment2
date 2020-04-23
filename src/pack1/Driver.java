// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Main Driver Class</H1>
 *  <p>Phase 1: </p>
 *  <p>An array of flyingObject is created using populateFlyingObjects() to generate random valued objects</p>
 *  <p>The array is traced through to display the information of the 2 cheapest objects along with their index</p>
 *  <p>Phase 2: </p>
 *  <p>The same array is copied using copyFlyingObjectArray under the following restrictions</p>
 *  <ol>
 *  <li>Do NOT attempt to explicitly find the exact type of the objects being copied</li>
 *  <li>Do NOT attempt to find the object type inside the copy constructors</li>
 *  <li>Do NOT use clone().</li>
 *  </ol>
 *  <p>Contents of the original and copied arrays are displayed and using checkIfIdenticalFlyingObjectArray(), proven to be identical </p>
 *  @see FlyingObject
 *  @author KevinVe
 */

package pack1;
import java.util.Random;

import pack2.*;
import pack3.*;
import pack4.*;
import pack5.*;

/**
 * @author KevinVe
 */
public class Driver {
	/**Passed array of FlyingObject[] is copied and returned.
	 * @param flyingObjects[] array to be copied
	 * @return FlyingObject[] copied array
	 */
	public static FlyingObject[] copyFlyingObjectArray(FlyingObject[] flyingObjects) {
		FlyingObject[] outputArray = new FlyingObject[flyingObjects.length];
		for (int i = 0; i < flyingObjects.length; i++)
			outputArray[i] = flyingObjects[i].copy();
		return outputArray;
	}
	
	public static void main (String[] args) {
		final int MAXOBJECTS = 20; //Maximum number of objects in array
		FlyingObject[] flyingObjects = new FlyingObject[MAXOBJECTS];
		populateFlyingObjects(flyingObjects, MAXOBJECTS); //populate array with random descendants with random values
		
		//Phase 1
		display(flyingObjects);
		displayTwoCheapestFlyingObjects(flyingObjects);
		
		//Phase 2
		//FlyingObject[] copiedFlyingObjects = copyFlyingObjectArray(flyingObjects);
		//display(copiedFlyingObjects);
		//checkIfIdenticalFlyingObjectArray(flyingObjects, copiedFlyingObjects);
	}
	
	/**Searches input array for the 2 lowest priced objects. Displays their respective information and index value in the array.
	 * @param flyingObjects[] array of FlyingObject to be searched
	 */
	public static void displayTwoCheapestFlyingObjects(FlyingObject[] flyingObjects) {
		int indexOfCheapest = 0;
		int indexOfSecondCheapest = 0;
		
		for (int i = 1; i <flyingObjects.length; i++) { 
			if (flyingObjects[i].getPrice() <= flyingObjects[indexOfCheapest].getPrice()) { //if new cheapest is found
				indexOfSecondCheapest = indexOfCheapest; //i becomes new cheapest and 
				indexOfCheapest = i;					 //original cheapest becomes second cheapest
			}
		}
		
		//display their information
		System.out.println("The cheapest flying object is:\n" + flyingObjects[indexOfCheapest].toString());
		System.out.println("The second cheapest flying object is:\n" + flyingObjects[indexOfSecondCheapest].toString());
	}
	
	
	/**Displays information of every object in the array
	 * @param flyingObjects[] array of FlyingObject to be displayed
	 */
	public static void display(FlyingObject[] flyingObjects) {
		for(int i = 0; i < flyingObjects.length; i++) {
			if (i%5 == 0 && i != 0)
				System.out.print("\n");
			System.out.println(flyingObjects[i]);
		}
		System.out.print("\n");
	}
	
	/**Checks if a1's corresponding object in a2 are identical
	 * Displays whether they are the same or not for each index
	 * @param a1 array of FlyingObjects to be checked against
	 * @param a2 array of FlyingObjects to be checked with
	 */
	public static void checkIfIdenticalFlyingObjectArray(FlyingObject[] a1, FlyingObject[] a2) {
		if (a1.length != a2.length) //if arrays have different lengths then they are different
			System.out.print("Arrays do not have the same length");
		else
			for (int i = 0; i < a1.length; i++) { //for each object in array, verify corresponding congruency 
				if (a1[i].equals(a2[i]))
					System.out.println("Object at index " + i + " are equal.");
				else
					System.out.println("Error at index: " + i);
			}
	}
	
	/**Populates FlyingObject array with random descendant objects with random values
	 * @param f FlyingObject array to be populated
	 * @param MAXOBJECTS maximum size of the array
	 */
	public static void populateFlyingObjects (FlyingObject[] f, int MAXOBJECTS) {
		final String[] BRANDS = {"QWERTY", "Asdf","Poop"}; //list of possible brands
		final double priceRange = 999999;
		double price = 0;
		Random r = new Random();
		for (int i = 0; i < MAXOBJECTS; i++) {
			price = Math.floor(r.nextDouble()*priceRange)/100.0+1000.0; //generate price
			switch (r.nextInt(7)) { //pick random descendant object
			case(0):
				f[i] = new Airplane(BRANDS[r.nextInt(BRANDS.length)], price, r.nextInt(200));
				break;
			case(1):
				f[i] = new Helicopter(r.nextInt(3)*2, r.nextInt(20)+1990, r.nextInt(10), BRANDS[r.nextInt(BRANDS.length)], price, r.nextInt(200));
				break;
			case(2):
				f[i] = new Quadcopter(r.nextInt(100)+100, r.nextInt(3)*2, r.nextInt(20)+1990, r.nextInt(10), BRANDS[r.nextInt(BRANDS.length)], price, r.nextInt(200));
				break;
			case(3):
				f[i] = new Multirotor(r.nextInt(6)+2, r.nextInt(3)*2, r.nextInt(20)+1990, r.nextInt(10), BRANDS[r.nextInt(BRANDS.length)], price, r.nextInt(200));
				break;
			case(4):
				f[i] = new UAV(Math.floor(r.nextDouble()*99999)/100, price);
				break;
			case(5):
				f[i] = new AgriculturalDrone(BRANDS[r.nextInt(BRANDS.length)], r.nextInt(10),Math.floor(r.nextDouble()*99999)/100, price);
				break;
			case(6):
				f[i] = new MAV(BRANDS[r.nextInt(BRANDS.length)],Math.floor(r.nextDouble()*10000)/100,Math.floor(r.nextDouble()*99999)/100, price);
				break;
			}
		}
	}
}
