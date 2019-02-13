import java.awt.geom.Point2D;
import java.awt.Color;

public class SquareTree {

	private static Point2D.Double min, max;
	private static Color background = StdDraw.GRAY;
	private static final int SIZE = 800;
	private static Square square;
	private static Point2D.Double center;

	public static void main(String[] args) {
		setup();
		loop();
	}

	public static void setup() {
		min = new Point2D.Double(0, 0);
		max = new Point2D.Double(SIZE, SIZE);
		StdDraw.setCanvasSize(SIZE, SIZE);

		StdDraw.setXscale(min.x, max.x);
		StdDraw.setYscale(min.y, max.y);

		center = new Point2D.Double(SIZE / 2, SIZE / 2);
		square = new Square();
		
	}

	public static void loop() {
		int n = 5;
		StdDraw.clear(background);

		// Square firstSquare = new Square();

		// firstSquare.drawSquare(center, SIZE / 2, StdDraw.WHITE);

		drawTree(n, center);

		StdDraw.show();
	}

	public static void drawTree(int n, Point2D.Double center) {
		if (n <= 1) {
			
			square.drawSquare(center, )
		}
	}


}