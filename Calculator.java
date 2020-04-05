import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Calculator {
    public static void main(String args[]) {
   		// Set the scanner to read from user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Principal: "); // Prompt to get the principal
		long principal = scanner.nextLong(); // Get principal from user input

		System.out.print("Anual Interest Rate: "); // Prompt to get the anual interest rate
		double anualInterestRate = scanner.nextDouble(); // Read data from user input

		System.out.print("Period (Years): "); // Prompt to get the period of time in years
		byte period = scanner.nextByte(); // Read input from user input

		// Number of payments
		int numberOfPayments = period * 12;

		// Calculate the monthly interest rate
		double monthlyInterestRate = (anualInterestRate / 100) / 12;

		// Calcular el numerador
		double numerador = Math.pow((monthlyInterestRate + 1), numberOfPayments) * monthlyInterestRate;

		// Calcular el denominador
		double denominador = Math.pow((monthlyInterestRate + 1), numberOfPayments) - 1;

		// Calculate the while amount
		double resultado = (numerador / denominador) * principal;

		// Format the result in price format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String total = currency.format(resultado);
		System.out.println(total);
    }
}