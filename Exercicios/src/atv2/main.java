package atv2;

import java.util.Locale;
import java.util.Scanner;
import Aluno.aluno;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		aluno aluno = new aluno();
		aluno.Name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.println(aluno);
		sc.close();
	}

}
