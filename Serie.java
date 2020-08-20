import java.util.*;

public class main {

	public static void main(String[] args) {
		
		main obj = new main();
		Scanner leer = new Scanner(System.in);
		int a=0;
		System.out.print("Escriba la sucesión que desea: ");
		a=leer.nextInt();
		
		System.out.println("La sucesion "+a+" de Fibonacci recursiva es "+
		obj.fibonacci(a));
		
	}
	
	public int fibonacci(int n) {
		
		if(n==1) {
			return 0;
		}
		if(n==2) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
	}

}
