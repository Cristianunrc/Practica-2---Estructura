package colecciones;

import java.util.Collection;

/**
* Implementación basada en arreglos de tamaño fijo de la interfaz {@code Cola}.
* @see colecciones.cola.Cola
*/
public class ColaArregloFijo<T> implements Cola<T> {

	/**
	* Capacidad máxima por defecto ({@value #CAPACIDAD_POR_DEFECTO})
	*/
	public static final int CAPACIDAD_POR_DEFECTO = 20;
	private Object[] arreglo; // arreglo de Object
	private int elementos = 0;
	private int comienzo;
	private int fin;

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
		comienzo = 0; // inicializo comienzo en 0
		fin = -1; // incializo fin en -1
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

	@Override
	public boolean esVacia() {
		return (comienzo  > fin);
	}

	@Override
	public int elementos() {
		
		if (esVacia()) {
			return 0;
		}else {
			return (fin - comienzo + 1);
		}
	}

	@Override
	public boolean encolar(T elem) {
		if (esVacia()) {
			arreglo [comienzo] = elem; // arreglo [0] = elem
			comienzo ++; 
			return true;
		}else {
			arreglo [comienzo] = elem;
			comienzo ++;
			return true;
		}
	}

	@Override
	public T desencolar() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");
	}

	@Override
	public T primero() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	@Override
	public void vaciar() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
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
			while (i <= comienzo) {
				result = result + String.valueOf(arreglo[i]) + "\n";
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
