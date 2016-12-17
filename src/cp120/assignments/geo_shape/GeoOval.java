/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Graphics2D;

/**
 * @author Jack Lisenko
 *
 */
public class GeoOval extends GeoRectangle {

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoRectangle#draw(java.awt.Graphics2D)
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = super.toString();
		String output = String.format("Drawing oval: %s", arg1);
		System.out.println(output);
	}
}
