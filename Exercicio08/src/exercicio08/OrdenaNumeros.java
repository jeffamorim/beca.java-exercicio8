package exercicio08;
import java.util.Scanner;
import java.util.Arrays;

public class OrdenaNumeros {

	public int numeros[] = new int[10];
	public int i =0;

	
	public void popularArray() {
		while(i < 10) {
			System.out.println("Digite uma sequencias de 10 numero: ");
			numeros[i] = new Scanner(System.in).nextInt();
			i++;
		}
	
		
	}
	
	public void ordenar() {
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.println("os numeros ordenados são: "+numero);
		}
	}
	
}
package exercicio08;
import java.util.Scanner;
import java.util.Arrays;

public class OrdenaNumeros {

	public int numeros[] = new int[10];
	public int i =0;

	
	public void popularArray() {
		while(i < 10) {
			System.out.println("Digite uma sequencias de 10 numero: ");
			numeros[i] = new Scanner(System.in).nextInt();
			i++;
		}
	
		
	}
	
	public void ordenar() {
		for (int numero : numeros) {
			System.out.println("os numeros ordenados são: "+numero);
		}
	}
	
}
