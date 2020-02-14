package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Digite A quantidade de Funcionario:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.println("Funcionario tercerizado? (S/N)");
			char res = sc.next().charAt(0);
			
			if(res == 'S') {
		    sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Hours:");
			int hours = sc.nextInt();
			System.out.print("Value per hour:");
			double value = sc.nextDouble();
			System.out.print("Additional charge:");
			double addi = sc.nextDouble();
			
			list.add(new OutsourcedEmployee(name, hours, value, addi));
			
	      }else {
	    	  sc.nextLine();
				System.out.print("Name:");
				String name = sc.nextLine();
				System.out.print("Hours:");
				int hours = sc.nextInt();
				System.out.print("Value per hour:");
				double value = sc.nextDouble();
				
				list.add(new Employee(name, hours, value));
	    	  
	      }
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
	}

}
