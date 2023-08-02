package calculadoraJava;
import java.util.Scanner;

public class Principal {
	public static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Calculadora Python em Java (Exercício Pessoal de Fixação)");
		inicio();
	}

public static void inicio() {
	int iniciar = 0;
	System.out.print("> Deseja Iniciar a Calculadora? [1 - S/2 - N]: ");
	iniciar = teclado.nextInt();
	
	switch(iniciar) {
	case 1:
		menu();
		break;
	case 2:
		System.out.println("Calculadora Encerrada.");
		System.exit(2);
	}
}
	
public static void menu() {
	
	int opcao = 0;
	
	System.out.println("= Menu de Operações da Calculadora =");
	System.out.println("0 - Encerrar Calculadora;");
	System.out.println("1 - Adição;");
	System.out.println("2 - Subtração;");
	System.out.println("3 - Multiplicação;");
	System.out.println("4 - Divisão;");
	System.out.println("5 - Expoente;");
	System.out.println("6 - Resto;");
	System.out.println("7 - Raíz Quadrada.");
	System.out.print("Digite a Opção Desejada: ");
	
	opcao = teclado.nextInt();
	
	switch(opcao) {
	case 0:
		System.out.println("Calculadora Encerrada.");
		System.exit(0);
	case 1:
		Operacoes.adicao();
		menu();
	case 2:
		Operacoes.subtracao();
		menu();
	case 3:
		Operacoes.multi();
		menu();
	case 4:
		Operacoes.divisao();
		menu();
	case 5:
		Operacoes.expo();
		menu();
	case 6:
		Operacoes.resto();
		menu();
	case 7:
		Operacoes.raiz();
		menu();
	}
}
}
