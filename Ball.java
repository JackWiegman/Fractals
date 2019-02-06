import java.awt.geom.Point2D;
import java.awt.Color;

public class Ball {

	private Point2D.Double center;
	private double radius;
	private Point2D.Double velocity;
	private Color fill;

	public static final double SPEED_FACTOR = 0.1;

	public Ball(double centerX, double centerY, double radius, Color fill) {
		center = new Point2D.Double(centerX, centerY);
		this.radius = radius;
		this.fill = fill;

		velocity = new Point2D.Double();
		velocity.x = SPEED_FACTOR * (Math.random() * 2 - 1); // -1, 1
		velocity.y = SPEED_FACTOR * (Math.random() * 2 - 1);
	}

	public void draw() {
		StdDraw.setPenColor(fill);
		StdDraw.filledCircle(center.x, center.y, radius);
	}

	// update
	public void update(Point2D.Double min, Point2D.Double max) {
		center.x += velocity.x;
		center.y += velocity.y;


		if (center.x - radius < min.x || center.x + radius > max.x) {
			velocity.x *= -1.0;
		} 
		if (center.y - radius < min.y || center.y + radius > max.y) {
			velocity.y *= -1.0;
		}

	}

}