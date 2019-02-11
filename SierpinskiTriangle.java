import java.awt.geom.Point2D;
import java.awt.Color;

public class SierpinskiTriangle {

	private static Point2D.Double min, max;
	private static Color background = StdDraw.GRAY;

	public static void main(String[] args) {
		setup();
		loop();
	}

	public static void setup() {
		min = new Point2D.Double(0, 0);
		max = new Point2D.Double(500, 500);

		StdDraw.setXscale(min.x, max.x);
		StdDraw.setYscale(min.y, max.y);
		
	}

	public static void loop() {
		int n = 6;
		StdDraw.clear(background);

		Triangle backgroundTriangle = new Triangle();

		Point2D.Double backTriTop = new Point2D.Double(max.x / 2, max.y);
		Point2D.Double backTriLeft = new Point2D.Double(0, 0);
		Point2D.Double backTriRight = new Point2D.Double(max.x, 0);
		backgroundTriangle.drawTriangle(backTriTop, backTriLeft, backTriRight, StdDraw.BLACK);

		drawTree(n);

		StdDraw.show();
	}

	public static void drawTree(int n) {
		// if (n < 1) {
		// 	drawTriangle(new Point2D.Double(back))
		// }
	}

}