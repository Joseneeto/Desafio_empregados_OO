package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	
	private Address address;
	List<Employee> employee = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void addEmployee(Employee employees) {
		employee.add(employees);
	}

	public void removeEmployee(Employee employees) {
		employee.remove(employees);
	}
	
	public double payRoll() {
		double sum = 0.0;
		for(Employee x : employee) {
			sum += x.getSalary();
		}
		return sum;
	}

}
