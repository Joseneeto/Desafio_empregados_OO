package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Telefone: ");
		String phone = sc.next();

		System.out.print("Quantos funcion�rios tem o departamento? ");
		int n = sc.nextInt();
		
		Address address = new Address(email, phone);
		
		Department dept = new Department(deptName, payDay, address);
		
		for(int i=0; i<n;i ++) {
			System.out.println("Dados do funcion�rio " + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(name, salary);
			dept.addEmployee(emp);
			
		}
		
		System.out.println();
		showReport(dept);
				
		sc.close();
	}
	
	public static void showReport(Department dept) {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO:\n");
		sb.append("Departamento de " + dept.getName() + " = R$ " + String.format("%.2f", dept.payRoll()) + "\n");
		sb.append("Pagamento realizado no dia " + dept.getPayDay() + "\n");
		sb.append("Funcion�rios:\n");
		for(Employee x : dept.getEmployee()) {
			sb.append(x.getName() + "\n");
		}
		sb.append("Para d�vidas favor entrar em contato: "
				+ dept.getAddress().getEmail());
		System.out.println(sb);
	}

}