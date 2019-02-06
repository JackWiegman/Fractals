import java.awt.geom.Point2D;
import java.awt.Color;

public class HTree {

	private static H h;
	private Color stroke = StdDraw.CYAN;
	private Color background = StdDraw.GRAY;
	private static Point2D.Double min, max;

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

		h = new H(max.x / 2.0, max.y / 2.0, 10);

	}

	public static void loop() {
		StdDraw.clear(StdDraw.background);

		StdDraw.show();

		drawTree(5);
	}

	public static void drawTree(int n, double legSize, double centerX, double centerY) {
		if (n < 1) {
			h.draw(centerX, centerY, legSize);
		}

		drawTree(n-1);
	}
}