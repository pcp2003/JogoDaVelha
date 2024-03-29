package pt.iscte.poo.utils;

import java.awt.Point;
import java.io.Serializable;


// Updated 27-Feb-2018
// Updated 28-Nov-2021

public class Point2D implements Serializable { // Added 23-Apr-2018

	/**
	 * 
	 */
	private static final long serialVersionUID = -8606069537456557526L;
	private final int x;
	private final int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point2D(Point point) {
		x = point.x;
		y = point.y;
	}

	public Point2D(java.awt.geom.Point2D point) {
		x = (int)point.getX();
		y = (int)point.getY();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	} 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	// added 28-Nov-2021

	public int distanceTo(Point2D p) {
		return Math.abs(p.getX() - x) + Math.abs(p.getY() - y);
	}
}
