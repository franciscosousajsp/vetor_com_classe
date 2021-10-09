package vetorcomclasse;

import java.util.Scanner;

import entidade.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		
		for(int i=0; i<vetor.length ; i++) {
			sc.nextLine();		
			String nome = sc.nextLine();
			double preco = sc.nextDouble();	
			vetor[i] = new Produto(nome, preco);
			
			
		}
		
		double soma = 0;
		
		for(int i=0; i<vetor.length; i++) {
			soma+=vetor[i].getPreco();
		} 	
		
		double media = soma/vetor.length;
		
		System.out.printf("média do preço %.2f%n ",media);
		
		sc.close();
		
	}

}
