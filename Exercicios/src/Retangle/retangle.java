package Retangle;

public class retangle {
	
	public double Width;
	public double Height;
	
	
	public double Area() {
		return Width * Height;
	}
	public double perimeter() {
		return (Height + Width) * 2;
	}
	public double diagonal() {
		double res = Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
		return res;
	}
	public String toString() {
		return "AREA = " + Area() + "\nPERIMETER = " + perimeter() + "\nDIAGONAL = " + diagonal();
	}
}