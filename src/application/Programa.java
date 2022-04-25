package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();
		List<Funcionario> list = new ArrayList<>();
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionário: Nº" + i +" Dados");
			System.out.print("Funcionário Tercerizado? (s/n)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 's') {
				System.out.print("Taxa Adicional: ");
				double custoAdicional = sc.nextDouble();
				//Funcionario fun = new FuncionarioTerceirizado(nome, horas, valorPorHora, custoAdicional);
				//list.add(fun);
				list.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, custoAdicional));
			}
			else {
				//Funcionario fun = new Funcionario(nome, horas, valorPorHora);
				//list.add(fun);
				list.add(new Funcionario(nome, horas, valorPorHora));
			}	
		}
		
		
		System.out.println();
		System.out.println("Pagamento: ");
		for (Funcionario fun : list) {
			System.out.println(fun.getNome() + " - R$ " + String.format("%.2f", fun.pagamento()));
		}
		
		
		
		sc.close();
	}

}
