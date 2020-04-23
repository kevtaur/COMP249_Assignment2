// -----------------------------------------------------
// Assignment 2
// Part: 1 and 2
// Written by: Kevin Ve, 40032669
// -----------------------------------------------------

/** <p>Due Date: February 21, 2020</p>
 *  <H1>Flying Object</H1>
 *  <p>Represents a Flying Object</p>
 *  @see Airplane
 *  @see UAV
 *  @author KevinVe
 */

package pack1;

public abstract class FlyingObject {
	protected abstract double getPrice();
	protected abstract FlyingObject copy();
	protected abstract boolean equals(FlyingObject f);
}