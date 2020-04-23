// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Multirotor</H1>
 *  <p>Represents a Multirotor</p>
 *  @see Helicopter
 *  @see FlyingObject
 *  @author KevinVe
 */

package pack3;
import pack1.FlyingObject;
import pack2.Helicopter;

public class Multirotor extends Helicopter{
	//attributes
	private int numberOfRotors;
	
	/** Creates a default Multirotor
	 */
	public Multirotor() {
		super();
		numberOfRotors = 0;
	}
	
	/**Creates Multirotor with set numberOfRotors, numberOfCylinders, creationYear, passengerCapacity, brand, price and horsePower
	 * @param numberOfRotors
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 * @param brand
	 * @param price
	 * @param horsePower
	 */
	public Multirotor(int numberOfRotors, int numberOfCylinders, int creationYear, int passengerCapacity, String brand, double price, int horsePower) {
		super(numberOfCylinders, creationYear, passengerCapacity, brand, price, horsePower);
		this.numberOfRotors = numberOfRotors;
	}
	
	/**Creates Multirotor with same values as passed Multirotor
	 * @param multirotor
	 */
	public Multirotor(Multirotor multirotor) {
		this.brand = multirotor.brand;
		this.price = multirotor.price;
		this.horsePower = multirotor.horsePower;
		this.numberOfCylinders = multirotor.numberOfCylinders;
		this.creationYear = multirotor.creationYear;
		this.passengerCapacity = multirotor.passengerCapacity;
		this.numberOfRotors = multirotor.numberOfRotors;
	}
	
	//accessors
	public int getNumberOfRotors() {return numberOfRotors;}
	
	//mutators
	public void setNumberOfRotors(int maxFlyingSpeed) {this.numberOfRotors = maxFlyingSpeed;}
	
	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This " + creationYear + " " + brand + " Multirotor costs $" + price + 
				", has " + numberOfCylinders + " cylinders, has a horsepower of " + horsePower + 
				", carries " + passengerCapacity + " people and has " + numberOfRotors + " rotors.";
	}
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof Multirotor))
			return false;
		else
			return (this.brand.equals(((Multirotor) f).brand) && 
					this.price == ((Multirotor) f).price && 
					this.horsePower == ((Multirotor) f).horsePower &&
					this.numberOfCylinders == ((Multirotor) f).numberOfCylinders &&
					this.creationYear == ((Multirotor) f).creationYear &&
					this.passengerCapacity == ((Multirotor) f).passengerCapacity &&
					this.numberOfRotors == ((Multirotor) f).numberOfRotors);
	}
	
	/**Creates a copy of this Multirotor and returns it
	 * @Override
	 * @return FlyingObject copied Multirotor
	 */
	protected FlyingObject copy() {
		return new Multirotor(this);
	}
}
