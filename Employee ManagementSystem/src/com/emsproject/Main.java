package com.emsproject;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out
				.println("******************** Welcome to Employee Management System *********************************"
						+ "\n1. Add Employee" + "\n2. show all Employee" + "\n3. show Employee based on id "
						+ "\n4. Update the Employee" + "\n5. Delete the Employee" + "\n6. Exist");
	}

	public static void main(String[] args) {
		String name;
		int id;

		EmployeeDaoInterf service = new EmployeeDaoImpl();

		// System.out.println("Welcome to Employee management application");

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			menu();
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				Employee emp = new Employee();
				System.out.println("Enter ID : ");
				id = sc.nextInt();

				System.out.println("Enter name : ");
				name = sc.next();

				System.out.println("Enter salary : ");
				double salary = sc.nextDouble();

				System.out.println("Enter age : ");
				int age = sc.nextInt();

				emp.setId(id);
				emp.setName(name);
				emp.setSalary(salary);
				emp.setAge(age);

				service.addEmployee(emp);

				break;

			case 2:
				service.showAllEmployee();
				break;

			case 3:
				System.out.println("Enter id to show the details : ");
				int empid = sc.nextInt();
				service.showEmployeeBasedOnID(empid);
				break;

			case 4:
				System.out.println("Enter id to update the details");
				int empid1 = sc.nextInt();
				System.out.println("Enter the new name");
				name = sc.next();
				service.updateEmployee(empid1, name);
				break;

			case 5:
				System.out.println("Enter the id to delete");
				id = sc.nextInt();
				service.deleteEmployee(id);
				break;

			case 6:
				System.out.println("Thank you for using application !!");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter valied choice");
				break;
			}
			System.out.println("Do you want to perform more operations [Yes - 1 ||  No - 0]");
			choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("Thank you");
			}
		} while (choice == 1);

		sc.close();

	}
}
