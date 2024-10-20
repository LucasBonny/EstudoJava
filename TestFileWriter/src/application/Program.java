package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//OUTPUT
		//Gerar nome do relatorio
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm");
		LocalDateTime time = LocalDateTime.now();
		String relatorioOutput = "C:\\temp\\relatorio_" + fmt.format(time) + ".xlsx";
		System.out.println(relatorioOutput);
		//criar arquivo
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(relatorioOutput))){
			//INPUT
			//Busca informação em um diretório especifico
			String inputFile = "C:\\temp\\in.txt";
			try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
				br.readLine();
				String line = br.readLine();
				while(line != null) {
					String[] fields = line.split(",");
					bw.write("Nome: " + fields[0] + " - Valor: R$ " + String.format("%.2f", Double.parseDouble(fields[1])) + " - Quantidade: " + fields[2]);
					bw.newLine();
					line = br.readLine();
				}
			}
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
