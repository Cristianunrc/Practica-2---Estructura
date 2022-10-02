package ColaListas;

import java.util.Scanner;

/**
 * Clase publica TestCola1 es el main donde se desarrola un menu con cuatro opciones
 * para la prueba del programa.
 */

public class TestCola1 {

	public static void main(String[] args) {
		
		int salir = -1;
		Cola1<Integer> lista = new Cola1 <Integer> ();
		
		while (salir != 4) {
				System.out.println ("Menu." + "\n" + "1 encolar." + "\n" + "2 desencolar." + "\n"  
									+ "3 mostrar." + "\n" + "4 salir." + "\n" + "Ingresse la opcion: ");
				Scanner entrada = new Scanner(System.in);
			
				int numero = Integer.parseInt(entrada.nextLine());
				switch (numero) {
						case 1: 
								System.out.println("Digite el numero a encolar: ");
								int num = Integer.parseInt(entrada.nextLine());
								System.out.println (lista.encolar(num));
								break;
						
						case 2: 
								System.out.println ("Elemento desencolado: " + lista.desencolar() );
								break;
						
						case 3:	
								System.out.println (lista.toString());
								break;
								
						case 4: 
								salir = 4;
				
				}		
				
		}

	}

}
