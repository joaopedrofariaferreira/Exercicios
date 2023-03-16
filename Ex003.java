package execicios_iniciais;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		//Programa para ler a idade e transforma-lá em dias, meses, anos 
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade em anos: ");
		int idade = teclado.nextInt();
		
		// achando idade em dias
		int idadeEmDias = idade * 360;
		System.out.println("Sua idade em dias é igual a " + idadeEmDias);
		
		// achando idade em meses
		int IdadeEmMeses = idade * 12;
		System.out.println("Sua idade em meses é igual a " + IdadeEmMeses);
		
		// achando em dias
		int IdadeEmDias = IdadeEmMeses * 30;
		System.out.println( "Você já viveu " + IdadeEmDias + " dias");
		
		//achando em horas
		//1 hora tem 60 minuts
		//1 minuto tem 60 segundos
		//1 hora sao 60 minutos 3200 segundos
		int IdadeEmHoras = IdadeEmDias + (60);
		
	}

}
