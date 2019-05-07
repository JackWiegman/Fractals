import java.awt.geom.Point2D;
import java.awt.Color;

public class H {

	private Point2D.Double center;
	private double legSize;
	private Color stroke;


	public H(double centerX, double centerY, double legSize, Color stroke) {
		center = new Point2D.Double(centerX, centerY);
		this.legSize = legSize;
		this.stroke = stroke;
	}

	public void draw(double centerX, double centerY, double legSize) {
		StdDraw.setPenColor(stroke);
		StdDraw.line(centerX + legSize / 2, centerY,
				centerX - legSize / 2, centerY);
		StdDraw.line(centerX + legSize / 2, centerY + legSize / 2,
				centerX + legSize / 2, centerY - legSize / 2);
		StdDraw.line(centerX - legSize / 2, centerY + legSize / 2,
				centerX - legSize / 2, centerY - legSize / 2);
	}

	public void update(double centerX, double centerY, double legSize) {

	}

}
