package entities;

import java.util.Date;

import entities.enums.Worker;

public class Employee {
	private String name;
	private Date data_nasc;
	private Worker worker;
	private String phone;
	
	public Employee(String name, Date data_nasc,Worker worker, String phone) {
		this.name = name;
		this.data_nasc = data_nasc;
		this.worker = worker;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", data_nasc=" + data_nasc + ", worker=" + worker + ", phone=" + phone + "]";
	}
	
	
}