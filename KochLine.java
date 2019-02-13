import java.awt.geom.Point2D;
import java.awt.Color;

public class KochLine {

	private double centerX, centerY, length;
	private Point2D.Double center;

	public KochLine() {
		// center = new Point2D.Double(centerX, centerY);
		// this.length = length;
	}

	public void drawLine(Point2D.Double end1, Point2D.Double end2) {
		StdDraw.line(end1.x, end1.y, end2.x, end2.y);
	}

	public void drawTree(int n, Point2D.Double end1, Point2D.Double end2) {
		if (n >= 1) {

			double slope = (end1.y - end2.y) / (end1.x - end2.x);
			double len = (Math.sqrt(Math.pow(end1.x - end2.x, 2) + (Math.pow(end1.y - end2.y, 2))));
			double newLen = len / 3;

			double dx = end2.x - end1.x;
			double dy = end2.y - end2.x;
			Point2D.Double newEnd = new Point2D.Double(end1.x + newLen, end1.y + newLen)
			Point2D.Double topPoint = new Point2D.Double()

			drawLine(end1, )
			drawLine(newEnd, )
			drawTree(n - 1, )
		}

	}

}