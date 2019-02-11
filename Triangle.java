import java.awt.geom.Point2D;
import java.awt.Color;

public class Triangle {

	private Point2D.Double center;
	private double leg;
	private Color stroke;

	public Triangle() {
		// center = new Point2D.Double(centerX, centerY);
		// this.leg = leg;
	}

	public void drawTriangle(Point2D.Double point1, Point2D.Double point2,
							Point2D.Double point3, Color fill) {
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(fill);

		// StdDraw.line(point1.x, point1.y, point2.x, point2.y);
		// StdDraw.line(point3.x, point3.y, point2.x, point2.y);
		// StdDraw.line(point1.x, point1.y, point3.x, point3.y);

		double[] xPoints = {point1.x, point2.x, point3.x};
		double[] yPoints = {point1.y, point2.y, point3.y};

		StdDraw.filledPolygon(xPoints, yPoints);

		// System.out.println(StdDraw.getPenRadius());

	}

}