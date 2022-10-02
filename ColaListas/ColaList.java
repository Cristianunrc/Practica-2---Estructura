package ColaListas;

/** 
 * Tipo abstracto de datos cola de prioridad implementada con listas doblemente encadenadas,
 * la cual tiene una referencia apuntando al primer elemento y otra referencia
 * apuntando al ultimo elemento de la lista.
 */

public interface ColaList<P> {
	
	/**
	 * Inserta un elemento al final de la lista.
	 * @param elem polimorfico
	 * @return true si el elemento fue insertado correctamente.
	 */
	public boolean encolar(P elem);
	
	/**
	 * Elimina el primer elemento de la lista.
	 * @return elemento eliminado.
	 */
	public P desencolar();
	
	/**
	 * Dice si la lista esta vacia.
	 * @return true si es vacia.
	 */
	public boolean esVacia();
	
	/**
	 * Muestra por pantalla los elementos de la lista.
	 */
	@Override
	public String toString();

}
