// custo_final = (custo_de_fabrica + porcentagem_distribuidor + impostos)
// DEV: Caio Alves 

import java.util.Scanner;

public class Custo_Final {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do custo de fábrica: ");
		double custo_fabrica = sc.nextDouble();

		double porcentagem_distribuidor = (custo_fabrica * 28 / 100);
		double impostos = (custo_fabrica * 45 / 100);

		double custo_final = (custo_fabrica + porcentagem_distribuidor + impostos);

		System.out.printf("\nO valor final do veículo é de: R$%.2f", custo_final);
	}

}
