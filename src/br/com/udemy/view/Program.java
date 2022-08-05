package br.com.udemy.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.entities.Employee;
import br.com.udemy.entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("Digite o número de funcionários: ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Digite 1 - Funcionário ou 2 - Terceirizados");
			Integer escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.println("Digite o nome do funcionário: ");
				String nome = sc.next();

				System.out.println("Digite o número de horas: ");
				Integer hours = sc.nextInt();

				System.out.println("Digite o valor por hora: ");
				Double valuePerHour = sc.nextDouble();
				
				list.add(new Employee(nome, hours, valuePerHour));

			} else if (escolha == 2) {

				System.out.println("Digite o nome do funcionário: ");
				String nome = sc.next();

				System.out.println("Digite o número de horas: ");
				Integer hours = sc.nextInt();

				System.out.println("Digite o valor por hora: ");
				Double valuePerHour = sc.nextDouble();

				System.out.println("Digite o valor adicional: ");
				Double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourceEmployee(nome, hours, valuePerHour, additionalCharge));
			}
				
		}
		System.out.println();
		System.out.println("Payments: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
		sc.close();
	}
}
