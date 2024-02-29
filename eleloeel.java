package morbidade;

import java.util.Scanner;

public class eleloeel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual o seu peso");
		double peso = sc.nextDouble();
		System.out.println("Qual a sua altura ?");
		double altura = sc.nextDouble();
		double IMC = peso * altura;
		System.out.println(IMC);
	   if(IMC == 24.44) {
		   System.out.println("Peso médio");
		   
	   }else if(IMC > 24.44){
		   System.out.println("Peso acima da média");
	   }
	}

}
