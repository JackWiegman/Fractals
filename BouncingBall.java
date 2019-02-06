import java.awt.geom.Point2D;
import java.awt.Color;

public class BouncingBall {

	private static Point2D.Double min, max;
	private static Ball ball;

	public static void main(String[] args) {
		setup();

		while(true) {
			loop();
		}
	}

	public static void setup() {
		min = new Point2D.Double(0, 0);
		max = new Point2D.Double(100, 100);

		StdDraw.setXscale(min.x, max.x);
		StdDraw.setYscale(min.y, max.y);
		StdDraw.enableDoubleBuffering();

		ball = new Ball(50, 50, 10, StdDraw.CYAN);

	}

	public static void loop() {
		StdDraw.clear(StdDraw.GRAY);

		ball.draw();

		StdDraw.show();

		ball.update(min, max);
	}
}