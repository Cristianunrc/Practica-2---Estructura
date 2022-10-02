package ColaListas;

/**
 * Clase publica Cola1<P> que implementa la interface ColaList<P>,
 * se desarrollan los metodos encolar, desencolar, esVacia y toString.
 */

public class Cola1<P> implements ColaList <P> {
	
	Nodo <P> primero;
	Nodo <P> ultimo;
	
	/**
	 * Constructor donde se setan las referencias primero y ultimo en null.
	 */
	public Cola1 () {
		primero = null;
		ultimo = null;
	}
	
	public boolean encolar (P elem) {
		
		Nodo <P> aux = new Nodo <P> (elem);
		aux.setBack(ultimo); // el back de lo que apunta aux, ahora apunta a ultimo
		
		if (ultimo == null) {
			primero = aux;
		}else {
			ultimo.setNext(aux);
		}
		
		ultimo = aux;
		return true;		
	}
	
	public P desencolar () {
		
		if ( esVacia() ) {
			throw new IllegalStateException ("Cola vacia.");
		}else {
		
			Nodo <P> aux = null; // inicializo el aux
			P elemento = primero.getInfo(); // en elemento guardo el valor del primer nodo.
			aux = primero;
			primero = aux.getNext();
		
			if (primero == null) {
				ultimo = null;
			}else {
				primero.setBack(null);
			}
			
			return elemento;
		}
	}
	
	public boolean esVacia() {
		return (primero == null && ultimo == null);
	}
	
	public String toString() {
		
		String result = "";
        Nodo<P> actualFirst = primero;

        if ( actualFirst == null ) {
            throw new IllegalStateException("Pila vacia.");
        }

        while( actualFirst != null ){
                result += String.valueOf( actualFirst.getInfo()) + "  ";
                actualFirst = actualFirst.getNext();  
        }
        return result; 
		
	}

}