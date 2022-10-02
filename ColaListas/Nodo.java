package ColaListas;

/**
 * Clase que define atributos, constructor, setter y getters.
 * Se define un "triplete" para la lista doblemente enlazada.
 * @param <P> polimorfico
 */
public class Nodo<P> {
	
	private P info;
	private Nodo<P> next;
	private Nodo<P> back;
	
	/**
	 * Constructor Nodo donde se setea info en elem, next y back en null.
	 * @param elem
	 */
	public Nodo (P elem){
		info = elem;
		next = null;
		back = null;
	}
	
	/**
	 * Setter del info.
	 * @param nuevoInfo
	 */
	public void setInfo (P nuevoInfo) {
		this.info = nuevoInfo;
	}
	
	/**
	 * Getter del info.
	 * @return info
	 */
	public P getInfo () {
		return (info);
	}
	
	/**
	 * Setter del next.
	 * @param newNext
	 */
	public void setNext (Nodo <P> newNext) {
		this.next = newNext;
	}
	
	/**
	 * Getter del next.
	 * @return next
	 */
	public Nodo <P> getNext (){
		return (next);
	}
	
	/**
	 * Setter del back.
	 * @param newBack
	 */
	public void setBack (Nodo <P> newBack) {
		this.back = newBack;
	}
	
	/**
	 * Getter del back.
	 * @return back
	 */
	public Nodo <P> getBack (){
		return (back);
	}

}