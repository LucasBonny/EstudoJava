import java.util.Random;

public class Program {

	
	public static void main(String[] args) {
		
		double i = new Random().nextDouble();
		
		System.out.println(String.format("%.2f", i));
	}
}