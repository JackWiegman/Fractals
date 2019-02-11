import java.awt.geom.Point2D;
import java.awt.Color;

public class Triangle {

	private Point2D.Double center;
	private double leg;

	public Triangle(double centerX, double centerY, double leg) {
		center = new Point2D.Double(centerX, centerY);
		this.leg = leg;
	}

}