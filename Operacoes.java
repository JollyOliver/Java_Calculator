package calculadoraJava;

public class Operacoes {
	
	public static float num1 = 0;
	public static float num2 = 0;
	public static float resultado = 0;
	
	public static void adicao() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = num1 + num2;
		
		System.out.println("Resultado da Adição: " + resultado);
		System.out.println();
	}
	
	public static void subtracao() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = num1 - num2;
		
		System.out.println("Resultado da Subtração: " + resultado);
		System.out.println();
	}
	
	public static void multi() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = num1 * num2;
		
		System.out.format("Resultado da Multiplicação: %2f" + resultado);
		System.out.println();
	}
	
	public static void divisao() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = num1 / num2;
		
		System.out.println("Resultado da Divisão: " + resultado);
		System.out.println();
	}
	
	public static void expo() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = (float) Math.pow(num1, num2);
		
		System.out.format("Resultado do Expoente: %2f" + resultado);
		System.out.println();
	}
	
	public static void resto() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = num1 % num2;
		
		System.out.println("Resultado do Resto: " + resultado);
		System.out.println();
	}

	public static void raiz() {
		System.out.println("Defina os Números da Operação.");
		System.out.print("Número 1: ");
		num1 = Principal.teclado.nextFloat();
		System.out.print("Número 2: ");
		num2 = Principal.teclado.nextFloat();
		
		resultado = (float) Math.sqrt(num1);
		
		System.out.println("Resultado da Raíz do Primeiro Número: " + resultado);
		
		resultado = (float) Math.sqrt(num2);
		
		System.out.println("Resultado da Raíz do Segundo Número: " + resultado);
		
		System.out.println();
	}
}
