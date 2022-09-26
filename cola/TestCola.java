package cola;
import java.util.Scanner;

public class TestCola {

	public static void main(String[] args) {
		
		int salir = -1;
		ColaArregloFijo<Integer> array = new ColaArregloFijo <Integer> (2); // argumento con la capacidad del arreglo
		
		while (salir != 7) {
				System.out.println ("Menu." + "\n" + "1 encolar." + "\n" + "2 desencolar." + "\n" + "3 elementos." + 
									"\n" + "4 primer elemento." + "\n" + "5 vaciar." + "\n" 
									+ "6 mostrar." + "\n" + "7 salir." + "\n" + "Ingresse la opcion: ");
				Scanner entrada = new Scanner(System.in);
			
				int numero = Integer.parseInt(entrada.nextLine());
				switch (numero) {
						case 1: 
								System.out.println("Digite el numero a encolar: ");
								int num = Integer.parseInt(entrada.nextLine());
								System.out.println (array.encolar(num));
								break;
						
						case 2: 
								System.out.println ("Elemento desencolado: " + array.desencolar() );
								break;
						
						case 3:	
								System.out.println("Longitud del arreglo: " + array.elementos());
								break;
								
						case 4: 
								System.out.println("Primer elemento: " + array.primero());
								break;
			
						case 5: 
								array.vaciar();
								break;
						
						case 6:	
								System.out.println (array.toString());
								break;
			
						case 7:
								salir = 7;
				}		
				
		}
		
	}
}