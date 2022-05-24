package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> emps = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (answer == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				Employee emp = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				emps.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				emps.add(emp);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee e : emps) {
			System.out.println(e);

		}

		sc.close();
	}
}
