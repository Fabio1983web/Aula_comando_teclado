import java.util.Locale;
import java.util.Scanner;

public class Main_Entrada_Numerica_Flutuante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x ;
	    x = sc.nextDouble();
	    System.out.printf( " Voce digitou : %.2f%n", x );
	    sc.close();
	    
	}

}
