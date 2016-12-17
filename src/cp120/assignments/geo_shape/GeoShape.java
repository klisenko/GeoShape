/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * @author Jack Lisenko
 *
 */
public abstract class GeoShape {
	private GeoPoint origin;
	private Color color;
	
	public abstract void draw( Graphics2D gtx );

	/**
	 * @return the origin
	 */
	public GeoPoint getOrigin() {
		return origin;
	}
	
	/**
	 * @return the point
	 */
	public Point getIntOrigin() {
		return origin.getIntPoint();		
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(GeoPoint origin) {
		this.origin = origin;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * origin=(7.7,8.8),color=#ff00ff
	 */
	@Override
	public String toString() {
		String hex = "#"+Integer.toHexString(color.getRGB()).substring(2);
		return "origin=" + origin.toString() + ",color=" + hex;
	}
	
	
	
	
	
	

}
