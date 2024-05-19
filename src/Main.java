import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int n, femalesQuantity = 0, malesQuantity = 0;
		double smallest, tallest, femalesSum, femalesAverage;
		double[] heights;
		char[] genders;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		heights = new double[n];
		genders = new char[n];
				
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			heights[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genders[i] = sc.next().charAt(0);
		}
		
		smallest = heights[0];
		tallest = heights[0];
		for(int i = 0; i < heights.length; i++) {
			if(heights[i] < smallest) {
				smallest = heights[i];
			}
			if(heights[i] > tallest) {
				tallest = heights[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", smallest);
		System.out.printf("Maior altura = %.2f%n", tallest);
		
		femalesSum = 0.0;
		for(int i = 0; i < genders.length; i++) {
			if(genders[i] == 'f' || genders[i] == 'F') {
				femalesSum += heights[i];
				femalesQuantity++;
			}
			else {
				malesQuantity++;
			}
		}
		femalesAverage = femalesSum / femalesQuantity;
		System.out.printf("Media das alturas das mulheres = %.2f%n", femalesAverage);
		System.out.println("Numero de homens = " + malesQuantity);
		
		sc.close();
	}
}
