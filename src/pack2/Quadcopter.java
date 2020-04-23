// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Quadcopter</H1>
 *  <p>Represents a Quadcopter</p>
 *  @see Helicopter
 *  @see FlyingObject
 *  @author KevinVe
 */

package pack2;
import pack1.FlyingObject;

public class Quadcopter extends Helicopter{
	//attributes
	private int maxFlyingSpeed;
	
	/** Creates a default Quadcopter
	 */
	public Quadcopter() {
		super();
		maxFlyingSpeed = 0;
	}
	
	/**Creates Quadcopter with set maxFlyingSpeed, numberOfCylinders, creationYear, passengerCapacity, brand, price and horsePower
	 * @param maxFlyingSpeed
	 * @param numberOfCylinders
	 * @param creationYear
	 * @param passengerCapacity
	 * @param brand
	 * @param price
	 * @param horsePower
	 */
	public Quadcopter(int maxFlyingSpeed, int numberOfCylinders, int creationYear, int passengerCapacity, String brand, double price, int horsePower) {
		super(numberOfCylinders, creationYear, passengerCapacity, brand, price, horsePower);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**Creates Quadcopter with same values as passed Quadcopter
	 * @param quadcopter Quadcopter to be copied
	 */
	public Quadcopter(Quadcopter quadcopter) {
		this.brand = quadcopter.brand;
		this.price = quadcopter.price;
		this.horsePower = quadcopter.horsePower;
		this.numberOfCylinders = quadcopter.numberOfCylinders;
		this.creationYear = quadcopter.creationYear;
		this.passengerCapacity = quadcopter.passengerCapacity;
		this.maxFlyingSpeed = quadcopter.maxFlyingSpeed;
	}
	
	//accessors
	public int getMaxFlyingSpeed() {return maxFlyingSpeed;}
	
	//mutators
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {this.maxFlyingSpeed = maxFlyingSpeed;}
	
	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This " + creationYear + " " + brand + " Quadcopter costs $" + price + 
				", has " + numberOfCylinders + " cylinders, has a horsepower of " + horsePower + 
				", carries " + passengerCapacity + " people and has a maximum flying speed of " + maxFlyingSpeed + "km/h.";
	}
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof Quadcopter))
			return false;
		else
			return (this.brand.equals(((Quadcopter) f).brand) && 
					this.price == ((Quadcopter) f).price && 
					this.horsePower == ((Quadcopter) f).horsePower &&
					this.numberOfCylinders == ((Quadcopter) f).numberOfCylinders &&
					this.creationYear == ((Quadcopter) f).creationYear &&
					this.passengerCapacity == ((Quadcopter) f).passengerCapacity &&
					this.maxFlyingSpeed == ((Quadcopter) f).maxFlyingSpeed);
	}
	
	/**Creates a copy of this Quadcopter and returns it
	 * @Override
	 * @return FlyingObject copied Quadcopter
	 */
	protected FlyingObject copy() {
		return new Quadcopter(this);
	}
}
