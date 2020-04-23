// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Airplane</H1>
 *  <p>Represents an Airplane</p>
 *  @see FlyingObject
 *  @see Helicopter
 *  @author KevinVe
 */

package pack1;

public class Airplane extends FlyingObject{
	//attributes
	protected String brand;
	protected double price;
	protected int horsePower;
	
	/** Creates a default Airplane
	 */
	public Airplane() {
		brand = "";
		price = 0.0;
		horsePower = 0;
	}

	/**Creates Airplane with set brand, price and horsePower
	 * @param brand Any string
	 * @param price Any double
	 * @param horsePower Any int
	 */
	public Airplane(String brand, double price, int horsePower) {
		this.brand = brand;
		this.price = price;
		this.horsePower = horsePower;
	}
	
	/**Creates Airplane with same values as passed Airplane
	 * @param airplane Airplane to be copied
	 */
	public Airplane(Airplane airplane) {
		this.brand = airplane.brand;
		this.price = airplane.price;
		this.horsePower = airplane.horsePower;
	}
	
	//accessors
	public String getBrand() {return brand;}
	public double getPrice() {return price;}
	public int getHorsePower() {return horsePower;}
	
	//mutators
	public void setBrand(String brand) {this.brand = brand;}
	public void setPrice(double price) {this.price = price;}
	public void setHorsePower(int horsePower) {this.horsePower = horsePower;}
	
	
	/**Returns user readable string of this object's information
	 * @return String
	 */
	public String toString() {
		return "This " + brand + " Airplane costs $" + price + " and has a horsepower of " + horsePower + ".";
	}
	
	
	/**Checks if passed object is equal to this object
	 * @Override
	 * @return boolean True if each attribute of passed object is equal to this' attributes, false otherwise
	 */
	protected boolean equals(FlyingObject f) {
		if (f == null)
			return false;
		else if (!(f instanceof Airplane))
			return false;
		else
			return (this.brand.equals(((Airplane) f).brand) && 
					this.price == ((Airplane) f).price && 
					this.horsePower == ((Airplane) f).horsePower);
	}
	
	/**Creates a copy of this Airplane and returns it
	 * @Override
	 * @return FlyingObject copied Airplane
	 */
	protected FlyingObject copy() {
		return new Airplane(this);
	}
}
