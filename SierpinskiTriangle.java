import java.awt.geom.Point2D;
import java.awt.Color;

public class SierpinskiTriangle {

	private static Point2D.Double min, max;
	private static Color background = StdDraw.GRAY;
	public static final int SIZE = 1024;
	public static Triangle triangle;

	public static void main(String[] args) {
		setup();
		loop();
	}

	public static void setup() {
		min = new Point2D.Double(0, 0);
		max = new Point2D.Double(SIZE, SIZE);
		StdDraw.setCanvasSize(1500, 800);

		StdDraw.setXscale(min.x, max.x);
		StdDraw.setYscale(min.y, max.y);

		triangle = new Triangle();
		
	}

	public static void loop() {
		int n = 10;
		StdDraw.clear(background);

		Triangle backgroundTriangle = new Triangle();

		double triangleHeight = SIZE * (Math.sqrt(3.0) / 2.0);
		Point2D.Double p1 = new Point2D.Double(max.x / 2, max.y);
		Point2D.Double p2 = new Point2D.Double(0, 0);
		Point2D.Double p3 = new Point2D.Double(max.x, 0);
		backgroundTriangle.drawTriangle(p1, p2, p3, StdDraw.BLACK);

		drawTree(n, p1, p2, p3);

		StdDraw.show();
	}

	public static void drawTree(int n, Point2D.Double p1, Point2D.Double p2,
								Point2D.Double p3) {
		if (n <= 1) {
			//drawTriangle(new Point2D.Double(max.x / 2, 0), new Point2D.Double())
			triangle.drawTriangle(p1, p2, p3, StdDraw.WHITE);
		} else {

			Point2D.Double p4 = midpoint(p1, p2);
			Point2D.Double p5 = midpoint(p2, p3);
			Point2D.Double p6 = midpoint(p1, p3);


			drawTree(n - 1, p1, p4, p6);
			drawTree(n - 1, p4, p2, p5);
			drawTree(n - 1, p6, p5, p3);
		}
	}

	public static Point2D.Double midpoint(Point2D.Double p1, Point2D.Double p2) {
		return new Point2D.Double((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

}