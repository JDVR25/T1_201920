package model.data_structures;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que representa el iterador sencillo (s�lo avanza hacia adelante).
 * @param <E> Tipo de informaci�n que almacena el iterador.
 */
public class IteradorSencillo<E> implements Iterator<E>, Serializable 
{

	/**
	 * Constante de serializaci�n
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * El nodo donde se encuentra el iterador.
	 */
	private NodoListaSencilla<E> actual;

	/**
	 * Constructor del iterador, inicia con el que llega como par�metro.
	 * @param primerNodo Nodo desde el que se iniciar� a recorrer.
	 */
	public IteradorSencillo(NodoListaSencilla<E> primerNodo) 
	{
		actual = primerNodo;
	}

	@Override
	public boolean hasNext() 
	{
		return actual != null;
	}

	@Override
	public E next() 
	{
		if(actual == null)
			throw new NoSuchElementException("Se ha alcanzado el final de la lista");
		E valor = actual.darElemento();
		actual = actual.darSiguiente();
		return valor;
	}

}
