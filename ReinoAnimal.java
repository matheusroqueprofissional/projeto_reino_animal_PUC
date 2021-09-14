import java.util.Scanner;

public class ReinoAnimal {
class mamiferos{
		
		String nome;
		int tempovida;
		float tamanho;
		
	}

public static void main(String[] args)
{
	int escolha;
	int escolhafinal =1;
	while (escolhafinal == 1) {
	escolhafinal =2;
	System.out.printf("Sistema de reino animal iniciado\n");
	Scanner input = new Scanner(System.in);
	System.out.println("qual animal Mamifero voce gostaria de observar?Leao[1] Morcego[2] Golfinho[3]");
	escolha = input.nextInt();
	if(escolha == 1)
	{
		System.out.println("VOCE ESCOLHEU LEAO\n o leao é um animal mamifero terrestre alem de ser o rei dos animais\n");
		String nome;
		nome = "leao";
		int tempodevida;
		tempodevida = 10;
		double tamanho;
		tamanho = 2;

		System.out.printf("Nome..........: %s\n"
				+ 		  "Tempo de vida.: %d anos\n"
				+         "Tamanho.......: %fM", nome,tempodevida,tamanho);
		escolhafinal=1;

	}
	if(escolha == 2)
	{
		System.out.println("VOCE ESCOLHEU MORCEGO\n morcegos são criaturas noturnas e utilizam o som para se locomover dentro das cavernas\n");
		String nome;
		nome = "Morcego";
		int tempodevida;
		tempodevida = 30;
		double tamanho;
		tamanho = 170;
		
		System.out.printf("Nome..........: %s\n"
				+ 		  "Tempo de vida.: %d anos\n"
				+         "Tamanho.......: %fcm", nome,tempodevida,tamanho);
		escolhafinal=1;
	}
	if(escolha == 3)
	{
		System.out.println("VOCE ESCOLHEU GOLFINHO\n Animais mamiferos aquaticos que conseguem se comunicar atraves de ondas sonoras transmitidas por si mesmos\n");
		String nome;
		nome = "Golfinho";
		int tempodevida;
		tempodevida = 17;
		double tamanho;
		tamanho = 2.5;
		
		System.out.printf("Nome..........: %s\n"
				+ 		  "Tempo de vida.: %d anos\n"
				+         "Tamanho.......: %fM", nome,tempodevida,tamanho);
		escolhafinal=1;

	}
	
	
	}
}
}
