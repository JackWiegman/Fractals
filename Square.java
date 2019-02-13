import java.awt.geom.Point2D;
import java.awt.Color;

public class Square {

	private Point2D.Double center;

	public Square() {

	}

	public void drawSquare(Point2D.Double center, double legSize, Color fill) {
		// filledSquare(double x, double y, double radius)
		StdDraw.setPenColor(fill);

		StdDraw.filledSquare(center.x, center.y, legSize / 2);
	}

}