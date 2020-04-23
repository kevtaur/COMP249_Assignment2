// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>UAV</H1>
 *  <p>Represents an UAV(Unmanned Aerial Vehicle)</p>
 *  @see FlyingObject
 *  @author KevinVe
 */

package pack4;
import pack1.FlyingObject;

public class UAV extends FlyingObject{
	//attributes
	protected double weight;
	protected double price;
	
	/** Creates a default UAV
	 */
	public UAV() {
		weight = 0.0;
		price = 0.0;
	}

	/**Creates UAV with set weight and price
	 * @param weight Any double
	 * @param price Any double
	 */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	
	/**Creates UAV with same values as passed UAV 
	 * @param uav UAV to be copied
	 */
	public UAV(UAV uav) {
		this.weight = uav.weight;
		this.price = uav.price;
	}
	
	//accessors
	public double getWeight() {return weight;}
	public double getPrice() {return price;}
	
	//mutators
	public void setWeight(double weight) {this.weight = weight;}
	public void setPrice(double price) {this.price = price;}
	
	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This UAV (Unmanned Aerial Vehicle) weighs " + weight + " and costs $" + price;
	}
	
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof UAV))
			return false;
		else
			return (this.weight == ((UAV) f).weight &&
			this.price == ((UAV) f).price);
	}
	
	/**Creates a copy of this UAV and returns it
	 * @Override
	 * @return FlyingObject copied UAV
	 */
	protected FlyingObject copy() {
		return new UAV(this);
	}
}
