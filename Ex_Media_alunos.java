// programa que faz a media de N numeros de provas
import java.sql.SQLOutput;
import java.util.Scanner;
public class Ex_Media_alunos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Olá, Digite seu nome:  ");
        String nomeAluno = leitura.nextLine();

        //System.out.println(nomeAluno);

        //PEDINDO PARA QUE O ALUNO DIGITE SUAS NOTAS
        System.out.print(nomeAluno + " Digite a nota da sua primeira prova: ");
        double primeiraNota = leitura.nextInt();

        System.out.print(nomeAluno + " Digite a nota da sua segunda prova: ");
        double segundaNota = leitura.nextInt();

        System.out.print(nomeAluno + " Digite a nota da sua terceira prova: ");
        double terceiraNota = leitura.nextInt();

        System.out.print(nomeAluno + " Digite a nota da sua quarta prova: ");
        double quartaNota = leitura.nextInt();

        //REALIZANDO CALCULOS
        double somaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota);
        System.out.println(somaGeral);
        double notaFinal = (somaGeral / 4);

        if( notaFinal >= 6){
            System.out.println("Sua média geral é igual a " + notaFinal + "! Parabéns, você passou de ano!");
        }else{
            System.out.println("Sua média foi de " + notaFinal + " infelizmente você foi reprovado!");
        }



    }
}
