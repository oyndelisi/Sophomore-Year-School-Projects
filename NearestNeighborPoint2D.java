import java.util.ArrayList;

public class NearestNeighborPoint2D {
	ArrayList<MyPoint2D> list;
	
	public NearestNeighborPoint2D() {
		this.list = new ArrayList<>();
	}
	
	public void add(MyPoint2D point) {
		list.add(point);
	}
	
	public MyPoint2D getNearestNeighbor(MyPoint2D point) {
		if (list.isEmpty()) {
			return null;
		}
		MyPoint2D minPoint = list.get(0);
		double minDistance = point.getDistance(list.get(0));
		
		for (MyPoint2D testPoint : list) {
			if (point.getDistance(testPoint) < minDistance) {
				minDistance = point.getDistance(testPoint);
				minPoint = testPoint;
			}
		}
		return minPoint;
	}
	
	public MyPoint2D getNearestNeighbor(double x, double y) {
		if (list.isEmpty()) {
			return null;
		}
		MyPoint2D newPoint = new MyPoint2D(x, y);
		return getNearestNeighbor(newPoint);
	}

}
