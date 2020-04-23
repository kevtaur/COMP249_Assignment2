// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>AgriculturalDrone</H1>
 *  <p>Represents a AgriculturalDrone</p>
 *  @see FlyingObject
 *  @see UAV
 *  @author KevinVe
 */

package pack5;
import pack1.FlyingObject;
import pack4.UAV;

public class AgriculturalDrone extends UAV{
	private String brand;
	private int carryCapacity;
	
	/** Creates a default AgriculturalDrone
	 */
	public AgriculturalDrone() {
		super();
		brand = "";
		carryCapacity = 0;
	}
	
	/**Creates AgriculturalDrone with set brand, carryCapacity, weight and price
	 * @param brand
	 * @param carryCapacity
	 * @param weight
	 * @param price
	 */
	public AgriculturalDrone(String brand, int carryCapacity, double weight, double price) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;
	}
	
	/**Creates AgriculturalDrone with same values as passed AgriculturalDrone
	 * @param agriculturalDrone AgriculturalDrone to be copied
	 */
	public AgriculturalDrone(AgriculturalDrone agriculturalDrone) {
		this.brand = agriculturalDrone.brand;
		this.carryCapacity = agriculturalDrone.carryCapacity;
		this.weight = agriculturalDrone.weight;
		this.price = agriculturalDrone.price;
	}
	
	//accessors
	public String getBrand() {return brand;}
	public int getCarryCapacity() {return carryCapacity;}
	
	//mutators
	public void setBrand(String brand) {this.brand = brand;}
	public void setCarryCapacity(int carryCapacity) {this.carryCapacity = carryCapacity;}

	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This " + brand + " Agricultural Drone weighs " + weight + ", costs $" + price +
				" and carries a maximum of " + carryCapacity + "lbs.";
	}
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof AgriculturalDrone))
			return false;
		else
			return (this.weight == ((AgriculturalDrone) f).weight &&
					this.price == ((AgriculturalDrone) f).price &&
					this.brand.equals(((AgriculturalDrone) f).brand) &&
					this.carryCapacity == ((AgriculturalDrone) f).carryCapacity);
	}
	
	/**Creates a copy of this Airplane and returns it
	 * @Override
	 * @return FlyingObject copied Airplane
	 */
	protected FlyingObject copy() {
		return new AgriculturalDrone(this);
	}
}
