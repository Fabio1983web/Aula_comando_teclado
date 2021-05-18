import java.util.Locale;
import java.util.Scanner;

public class Main_Entrada_string_int_double_juntos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x ;
		int y ;
		double z ;
		x = sc.next();
		y = sc.nextInt();
	    z = sc.nextDouble();
	    System.out.println("Voce digitou:");
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(z);
	    
	    sc.close();
	}

}
