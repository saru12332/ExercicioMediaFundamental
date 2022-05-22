package JavaProjectAvaliacao;

import java.util.Scanner;

public class MediaFundamental {

	public static void main(String[] args) {
		System.out.printf("Calcule sua media aritmetica com base em suas notas!\n");
		
		// Scanner para entrada de dados
		Scanner ler = new Scanner(System.in);

		// Declaracao das variaveis
		double n1, n2, n3, media;
		int i, ctAluno = 0, cod;

		// Laco para contagem e repeticao de comando
		for (i = 0; i < 1000; i++) {
			// Contador de aluno
			ctAluno++;
			
			// Entrada de dados, codigo do aluno
			System.out.printf(" Aluno " + ctAluno + "\nDigite seu codigo, caso nao tiver mais codigos, digite 0: ");
			// Ler o valor da entrada
			cod = ler.nextInt();
			
			// Estrutura de decisao para se houver codigo de aluno
			if (cod != 0) {

				// Entrada das notas: n1, n2, n3
				System.out.printf(" Aluno " + ctAluno + "\nDigite sua primeira nota: ");
				n1 = ler.nextDouble();

				System.out.printf(" Aluno " + ctAluno + "\nSua segunda nota: ");
				n2 = ler.nextDouble();

				System.out.printf(" Aluno " + ctAluno + "\nSua terceira nota: ");
				n3 = ler.nextDouble();

				// Calculo da media
				media = (n1 + n2 + n3) / 3;

				// Estrutura de decisao caso media for menor igual a 6
				if (media <= 6) {
					// Exebir ao usuario sua media e aprovado
					System.out.printf("Voce foi reprovado! Sua media: %2f\n", +media);
					
				// Estrutura de decisao caso media for menor que 8 e maior que 6
				} else if (media < 8 && media > 6) {
					// Exibir ao usuario sua media e recuperacao
					System.out.printf("Voce esta em recuperacao! Sua media: %2f\n", +media);
					
				// Estrutura de decisao caso media for maior igual a 8	
				} else if (media >= 8) {
					// Exibir ao usuario sua media e aprovado
					System.out.printf("Parabens, voce foi aprovado! Sua media: %2f\n", +media);
				}
			  // Estrutura de decisao caso codigo for = 0	
			} else {
				// parar o laco de repeticao 
				break;
			}

		}

	}
}
