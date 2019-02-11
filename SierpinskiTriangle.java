import java.awt.geom.Point2D;
import java.awt.Color;

public class SierpinskiTriangle {

	public static void main(String[] args) {
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
		
	}

}