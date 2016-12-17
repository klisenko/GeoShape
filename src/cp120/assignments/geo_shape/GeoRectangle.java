/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Graphics2D;

/**
 * @author Jack Lisenko
 *
 */
public class GeoRectangle extends GeoShape {
	
	private double width = 0;
	private double height = 0;

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoShape#draw(java.awt.Graphics2D)
	 * Drawing rectangle: origin=(10.02,10.03),color=#ffff00,width=6.6,height=5.5
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = this.toString();
		String output = String.format("Drawing rectangle: %s", arg1);
		System.out.println(output);
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoShape#toString()
	 * origin=(7.7,8.8),color=#00ff00,width=6.6,height=5.5
	 */
	@Override
	public String toString() {
		String arg1 = super.toString();
		return String.format("%s,width=%s,height=%s", arg1, width, height);
	}
	
	

}
