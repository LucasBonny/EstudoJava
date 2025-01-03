package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Employee;
import entities.enums.Worker;

public class Program {

	public static void main(String[] args) {
		
		//input
		List<Employee> emp = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			br.readLine();
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				
				String name = fields[0];
				LocalDate data_nasc = LocalDate.parse(fields[1]);
				Worker worker = Worker.valueOf(fields[2]);
				String phone = fields[3];
				
				emp.add(new Employee(name,Date.valueOf(data_nasc),worker,phone));
				
				line = br.readLine();
			}
			for(Employee s : emp) {
				System.out.println(s);
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			
		}

	}

}
