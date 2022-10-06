
public class MyPoint2D {
private double xCoord;
private double yCoord;

public MyPoint2D(double x, double y) {
	this.xCoord = x;
	this.yCoord = y;
}

public double getX() {
	return xCoord;
}

public double getY() {
	return yCoord;
}

public double getDistance(double x, double y) {
	MyPoint2D other = new MyPoint2D(x, y);
	return getDistance(other);
}

public double getDistance(MyPoint2D other) {
	return Math.sqrt(((other.xCoord - this.xCoord) * (other.xCoord - this.xCoord)) + ((other.yCoord - this.yCoord) * (other.yCoord - this.yCoord)));

}

public String toString() {
	String coordString = String.format("(%g, %g)", xCoord, yCoord);
	return coordString;
}
}
