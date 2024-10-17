package shapes;

public class Triangle implements Shape{
	private double width;
	private double height;
	
	public Triangle(double width,double height) {
		this.height = height;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {

		return (width * height) / 2;
	}

}