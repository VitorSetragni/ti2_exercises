package somar;

import java.util.Scanner;

public class Somas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		soma = num1 + num2;
		System.out.printf("soma %d\n", soma);
		sc.close();
		
	}

}
