import java.awt.geom.Point2D;
import java.awt.Color;

public class HTree {

	private static H h;
	private static Color stroke = StdDraw.CYAN;
	private static Color background = StdDraw.GRAY;
	private static Point2D.Double min, max;

	public static void main(String[] args) {
		int fracSize = 6;
		setup();
	
		loop();
	}

	public static void setup() {

		min = new Point2D.Double(0, 0);
		max = new Point2D.Double(500, 500);

		StdDraw.setXscale(min.x, max.x);
		StdDraw.setYscale(min.y, max.y);
		StdDraw.enableDoubleBuffering();

		h = new H(max.x / 2.0, max.y / 2.0, 10, stroke);

	}

	public static void loop() {
		int n = 6;
		StdDraw.clear(background);

		drawTree(n, max.x / 2, max.x / 2, max.y / 2);

		StdDraw.show();

	}

	public static void drawTree(int n, double legSize, double centerX, double centerY) {
		if (n < 1) return;
		h.draw(centerX, centerY, legSize);

		double x0 = centerX - legSize/2;
		double x1 = centerX + legSize/2;
		double y0 = centerY - legSize/2;
		double y1 = centerY + legSize/2;

		drawTree(n-1, legSize/2, x0, y0);
		drawTree(n-1, legSize/2, x0, y1);
		drawTree(n-1, legSize/2, x1, y0);
		drawTree(n-1, legSize/2, x1, y1);
	}
}