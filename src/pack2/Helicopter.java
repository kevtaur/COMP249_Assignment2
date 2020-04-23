// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Helicopter</H1>
 *  <p>Represents a Helicopter</p>
 *  @see Airplane
 *  @see FlyingObject
 *  @author KevinVe
 */

package pack2;
import pack1.Airplane;
import pack1.FlyingObject;

public class Helicopter extends Airplane {
	//attributes
	protected int numberOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	
	/** Creates a default Helicopter
	 */
	public Helicopter() {
		super();
		numberOfCylinders = 0;
		creationYear = 0;
		passengerCapacity = 0;
	}
	
	/**Creates Helicopter with set numberOfCylinders, creationYear, passengerCapacity, brand, price and horsePower
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 * @param brand
	 * @param price
	 * @param horsePower
	 */
	public Helicopter(int numberOfCylinders, int creationYear, int passengerCapacity, String brand, double price, int horsePower) {
		super(brand, price, horsePower);
		this.numberOfCylinders = numberOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
	
	/**Creates helicopter with same values as passed helicopter
	 * @param helicopter Helicopter to be copied
	 */
	public Helicopter(Helicopter helicopter) {
		this.brand = helicopter.brand;
		this.price = helicopter.price;
		this.horsePower = helicopter.horsePower;
		this.numberOfCylinders = helicopter.numberOfCylinders;
		this.creationYear = helicopter.creationYear;
		this.passengerCapacity = helicopter.passengerCapacity;
	}
	
	//accessors
	public int getNumberOfCylinders() {return numberOfCylinders;}
	public int getPassengerCapacity() {return passengerCapacity;}
	public int getCreationYear() {return creationYear;}
	
	//mutators
	public void setNumberOfCylinders(int numberOfCylinders) {this.numberOfCylinders = numberOfCylinders;}
	public void setCreationYear(int creationYear) {this.creationYear = creationYear;}
	public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}
	
	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This " + creationYear + " " + brand + " Helicopter costs $" + price + 
				", has " + numberOfCylinders + " cylinders, has a horsepower of " + horsePower + 
				" and carries " + passengerCapacity + " people.";
	}
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof Helicopter))
			return false;
		else
			return (this.brand.equals(((Helicopter) f).brand) && 
					this.price == ((Helicopter) f).price && 
					this.horsePower == ((Helicopter) f).horsePower &&
					this.numberOfCylinders == ((Helicopter) f).numberOfCylinders &&
					this.creationYear == ((Helicopter) f).creationYear &&
					this.passengerCapacity == ((Helicopter) f).passengerCapacity);
	}
	
	/**Creates a copy of this Helicopter and returns it
	 * @Override
	 * @return FlyingObject copied Helicopter
	 */
	protected FlyingObject copy() {
		return new Helicopter(this);
	}
}
