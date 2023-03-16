package execicios_iniciais;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args){
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor para saber a tábuada do mesmo: ");
		valor = teclado.nextInt();
		for (int i = 0; i < 11; i++) {
			System.out.println(valor + " x " +i + " = " + (valor * i));
		}
		
	}
}
 
/* A construção do pensamento ao redor do FOR se da a partir do seguinte raciocínio
for (int i = o; i < 10; i++){}

Dividiremos o for para melho entendimento. A primeira parte " int i = 0; " é onde o
função começa, aqui colocamos a partir de qual momento nosso programa iniciará a contagem

Em seguida, colocamos o intervalor que o nosso programa realizara a aação, " i < 10"
devemos nos lembrar que assim como em outras linguagens, a contagem inicial se da pelo numero 
zero, logo se quiseremos algo até o numero 10, devemos digitar o número 11.abstract

A terçeira e última parte e constituída pelo contador, esse que pode ser escrito de diversas formas
possui a reponsabilidade de somar um número todas vez que a condição listada a baixo acontecer. */
