// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>MAV</H1>
 *  <p>Represents a MAV(Micro Air Vehicle)</p>
 *  @see FlyingObject
 *  @see UAV
 *  @author KevinVe
 */

package pack5;
import pack1.FlyingObject;
import pack4.UAV;

public class MAV extends UAV{
	//attributes
	private String model;
	private double size;
	
	/** Creates a default MAV
	 */
	public MAV() {
		super();
		model = "";
		size = 0.0;
	}

	/**Creates MAV with set model, size, weight and price
	 * @param model Any String
	 * @param size Any double
	 * @param weight Any double
	 * @param price Any double
	 */
	public MAV(String model, double size, double weight, double price) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	/**Creates MAV with same values as passed airplane
	 * @param mav MAV to be copied
	 */
	public MAV(MAV mav) {
		this.model = mav.model;
		this.size = mav.size;
		this.weight = mav.weight;
		this.price = mav.price;
	}
	
	//accessors
	public String getModel() {return model;}
	public double getSize() {return size;}
	
	//mutators
	public void setModel(String brand) {this.model = brand;}
	public void setSize(int carryCapacity) {this.size = carryCapacity;}

	/**Returns user readable string of this object's information
	 */
	public String toString() {
		return "This " + model + " MAV (Micro Air Vehicle) weighs " + weight + ", costs $" + price +
				" and is " + size + "cm wide.";
	}
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	public boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof MAV))
			return false;
		else
			return (this.weight == ((MAV) f).weight &&
					this.price == ((MAV) f).price &&
					this.model.equals(((MAV) f).model) &&
					this.size == ((MAV) f).size);
	}
	
	/**Creates a copy of this MAV and returns it
	 * @Override
	 * @return FlyingObject copied MAV
	 */
	protected FlyingObject copy() {
		return new MAV(this);
	}
}
