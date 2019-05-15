package com.br.ola.mundo;
import java.util.Scanner;
public class estoque {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int  maximo = teclado.nextInt();
		int minimo = teclado.nextInt();
	      
		int media  = (maximo + minimo)/teclado.nextInt();
		System.out.println("A média do estoque é " + media );


	}

}
