import java.util.Scanner;
public class scanner {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ins�rer un nombre:");
		 
		int a = 2;
		int b = 3;
		
		int P = scan.nextInt();
		System.out.println(P);
		
		System.out.println("Ins�rer un deuxi�me nombre:");
		
		int M = scan.nextInt();
		System.out.println(M * a);
		
		System.out.println("Ins�rer une derni�re nombre:");
		
		int G = scan.nextInt();
		System.out.println(G * b);
		
		int T =  P + M*a + G*b;
		
		if (T >= 10) {
			System.out.println(" Barley est heureux");
		} 
		else if (T < 10) {
			System.out.println(" Barley est triste");
		}
		}
	}

