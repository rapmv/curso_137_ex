package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		

		method1();
		System.out.println("End of program");
	}
	
	public static void method1() {
		System.out.println("******METHOD1 START*****");
		
		method2();
		
		System.out.println("******METHOD1 END*****");
		
	}
	
	
	public static void method2() {
		
		System.out.println("******METHOD2 START*****");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		
		//excess�o se n�o tiver a posi��o escolhida.
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			
			//mostra todo o caminho que gerou essa excess�o.
			e.printStackTrace();
			sc.next();
		}
		
		//excess�o se for digitado uma letra em vez de numero
		catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		sc.close();
		
		System.out.println("******METHOD2 END*****");
	}

}
