package cola;

import java.util.Collection;

/**
* Implementación basada en arreglos de tamaño fijo de la interfaz {@code Cola}.
* @see colecciones.cola.Cola
*/
public class ColaArregloFijo<T> implements Cola<T> {

	/**
	* Capacidad máxima por defecto ({@value #CAPACIDAD_POR_DEFECTO})
	*/
	public static final int CAPACIDAD_POR_DEFECTO = 20; // tamaño del arreglo
	private Object[] arreglo; // arreglo de Object
	private int elementos = 0;

	/**
	* Construye una nueva cola vacía con una capacidad máxima de {@value #CAPACIDAD_POR_DEFECTO}.
	*/
	public ColaArregloFijo() {
		this(CAPACIDAD_POR_DEFECTO);
	}

	/**
	* Construye una nueva cola vacía con una capacidad determinada mayor a 0.
	* @param capacidad la capacidad de la cola
	* @throws IllegalArgumentException si {@code capacidad} es menor o igual a 0 
	*/
	public ColaArregloFijo(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("la capacidad debe ser un numero positivo (" + capacidad + ")");
		arreglo = new Object[capacidad]; // al arreglo se le da un tamaño de capacidad
	}

	/**
	* Construye una cola a partir de elementos en una colección.
	* Los elementos en la colección se encolan de izquierda a derecha.
	* La capacidad de la cola va a ser suficiente para por lo menos contener todos los elementos de la colección.
	* @param elems los elementos a agregar a la cola
	*/
	public ColaArregloFijo(Collection<T> elems) {
		if (elems == null)
			throw new IllegalArgumentException("elems es null");
		arreglo = new Object[Math.max(elems.size(), CAPACIDAD_POR_DEFECTO)];
		for (T e : elems) {
			encolar(e);	
		}
	}
	
	/**
	 * Chequea si el arreglo esta vacio.
	 */
	@Override
	public boolean esVacia() {
		return (elementos == 0); 
	}

	@Override
	public int elementos() {
		
		if (esVacia()) {
			return 0;
		}else {
			int acum = 0;
			for (int i = 0; i < arreglo.length; i++ ) {
					acum ++;
			}
			return acum;
		}
	}

	@Override
	public boolean encolar(T elem) {
		
		arreglo [elementos] = elem; // en la posicion elementos del arreglo inserto elem
		elementos ++;
		return true;
		
	}

	@Override
	public T desencolar() { // falta que ande bien
		
		if ( esVacia() ) {
			throw new IllegalArgumentException("El arreglo esta vacio.");
		}else {
			
			T valorSuprimido =  (T) arreglo [0]; // casteo el arreglo de Object a un tipo polimorfico T
			
			for (int j = 0; j < elementos () ; j++) {
				
				arreglo [j] = arreglo [j + 1];
			}
			
			int elem = elementos ();
			elem --;
			arreglo = new Object [elem]; // logro decrementar el tamaño del arreglo
			
			return (valorSuprimido); // retorno el valor desencolado
		}
	}

	@Override
	public T primero() {
		
		if ( esVacia() ) {
			
			throw new IllegalStateException("Arreglo vacio.");
		}else {
			
			T primerElem = (T) arreglo[0]; 
			return (primerElem);
		}
	}

	@Override
	public void vaciar() {
		
		if ( esVacia()) {
			throw new IllegalStateException ("Vaciar sobre arreglo vacio.");
		}else {
			arreglo = new Object [0]; // longitud del arreglo en 0
			System.out.println("El arreglo se vacio correctamente.");
		}
	}

	@Override
	public boolean repOK() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	@Override
	public String toString() {
		if ( esVacia() ) {
			throw new IllegalStateException ("El arreglo esta vacio.");
		}else {
			int i = 0;
			String result = "";
			while (i < elementos ()) {
				result = result + String.valueOf(arreglo[i]) + "  ";
				i++;
			}
			return result;
		}
	}

	@Override
	public boolean equals(Object other) {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	/**
	* Permite obtener un elemento del arreglo en un indice determinado realizando el casteo necesario.
	* @param index el indice del elemento a obtener
	*/
	@SuppressWarnings("unchecked")
   	private T elemento(int index) {
        	return (T) arreglo[index];
    	}

}
