package Aluno;

public class aluno {
	public String Name;
	public double nota1;
	public double nota2;
	public double nota3;

	public String toString() {
		double res = nota1 + nota2 + nota3;
		if(res > 60) {
			return "FINAL GRADE = " + String.format("%.2f", res) + "\nPASS";
		}
		else {
			double No = res - 60;
			return "FINAL GRADE = " + String.format("%.2f", res) + "\nFAILED\nMISSING " + String.format("%.2f", No) + " POINTS";
		}
	}
}
