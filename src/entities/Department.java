package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;

	private Address address;
	private List<Employee> employee = new ArrayList<>();

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

	public void addEmployee(Employee employees) {
		employee.add(employees);
	}

	public void removeEmployee(Employee employees) {
		employee.remove(employees);
	}

	public double payroll() {
		double sum = 0.0;
		for (Employee emp : employee) {
			sum += emp.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento Vendas = R$" + String.format("%.2f", payroll()) + "\n");
		sb.append("Pagamento realizado no dia " + getPayDay() + "\n");
		sb.append("Funcionários: \n");
		for (Employee employees : employee) {
			sb.append(employees.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: " + getAddress().getEmail());
		return sb.toString();
	}

}
