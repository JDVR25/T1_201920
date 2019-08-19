package model.data_structures;

import java.io.Serializable;

/**
 * Representa un nodo dentro de la lista. Este nodo almacena un elemento.
 *
 * @param <E> Tipo de elemento que se est� almacenando dentro de los nodos.
 */
public class NodoListaSencilla<E> implements Serializable
{

	/**
	 * Constante de Serializaci�n
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Elemento almacenado en el nodo.
	 */
	//TODO 6.1.1 Declare como atributo el elemento que se almacenar� en el nodo
	protected E elemento;

	/**
	 * Siguiente nodo.
	 */
	//TODO 6.1.2 Declare una referencia al siguiente elemento
	protected NodoListaSencilla<E> siguiente;

	/**
	 * Constructor del nodo.
	 * @param elemento El elemento que se almacenar� en el nodo. elemento != null
	 */
	public NodoListaSencilla(E elemento)
	{
		//TODO 6.1.3 Asigne el elemento que llega como par�metro al atributo
		this.elemento = elemento;
	}

	/**
	 * M�todo que cambia el siguiente nodo.
	 * <b>post: </b> Se ha cambiado el siguiente nodo
	 * @param siguiente El nuevo siguiente nodo
	 */
	public void cambiarSiguiente(NodoListaSencilla<E> siguiente)
	{
		//TODO 6.1.4 Cambie el siguiente nodo por el que llega como par�metro
		this.siguiente = siguiente;
	}

	/**
	 * M�todo que retorna el elemento almacenado en el nodo.
	 * @return El elemento almacenado en el nodo.
	 */
	public E darElemento()
	{
		return elemento;
	}

	/**
	 * Cambia el elemento almacenado en el nodo.
	 * @param elemento El nuevo elemento que se almacenar� en el nodo.
	 */
	public void cambiarElemento(E elemento)
	{
		this.elemento = elemento;
	}


	/**
	 * M�todo que retorna el siguiente nodo.
	 * @return Siguiente nodo
	 */
	public NodoListaSencilla<E> darSiguiente()
	{
		return siguiente;
	}

}
