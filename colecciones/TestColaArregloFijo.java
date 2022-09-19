package colecciones;

public class TestColaArregloFijo {

	public static void main(String[] args) {
		
		ColaArregloFijo <Integer> arr1 = new ColaArregloFijo <> (2);
		arr1.encolar(99);
		arr1.encolar(100);
		
		System.out.println (arr1.toString());
	}

}
