package pkgShape;

public class Rectangle extends Shape implements Comparable<Object> {

	private int iWidth;
	private int iLength;
	
	
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

	@Override
	public double area() {
		return iLength*iWidth;
	}

	@Override
	public double perimeter() {
		return (iLength*2 + iWidth*2);
	}

	@Override
	public int compareTo(Object o) {
		if (((Rectangle) o).area()<this.area()) {
			return 1;
		}
		else if (((Rectangle) o).area()>this.area())
			return -1;
		else {
			return 0;
		}
	}		
}
