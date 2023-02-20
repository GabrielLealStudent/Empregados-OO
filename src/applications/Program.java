package applications;

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
		String departmentName = sc.nextLine();

		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Telefone: ");
		String phone = sc.nextLine();

		Address address = new Address(email, phone);
		Department dept = new Department(departmentName, payDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.printf("Dados do funcionário %d:%n", i + 1);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("salário: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(name, salary);
			dept.addEmployee(employee);

		}
		System.out.println();

		showReport(dept);
		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println(dept.toString());
	}
}