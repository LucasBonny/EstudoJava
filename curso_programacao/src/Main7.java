import java.util.Locale;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char v;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = ( 9 * C ) / 5 + 32;
			System.out.println("Equivalente a: " + F + " F");
			System.out.println("Deseja executar novamente?");
			v = sc.next().charAt(0);
		}while (v != 'n');
	}

}
