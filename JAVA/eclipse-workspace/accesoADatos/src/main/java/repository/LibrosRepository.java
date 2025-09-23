package repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.LibreriaException;
import model.Libros;

public class LibrosRepository {

	private Set<Libros> libros;

	public Set<Libros> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libros> libros) {
		this.libros = libros;
	}

	public LibrosRepository(Set<Libros> libros) {
		super();
		this.libros = new HashSet<Libros>();
	}

	public boolean añadirLibro(Libros libro) {
		boolean esAñadido = false;
		if(libros.contains(libro)) {
			System.out.println("El libro ya está añadido.");
		}else {
			libros.add(libro);
			esAñadido = true;
			System.out.println("Libro añadido: " + libro);		
		}
		return esAñadido;
	}
	
	public boolean actualizarLibro(Libros libro) throws LibreriaException {
		boolean esActualizado = false;
		if(libros.contains(libro)) {
			esActualizado = true;

		} else {
			throw new LibreriaException("Este libro no existe.");
		}
		return false;
	}
	
	public boolean eliminarLibro(Libros libro) throws LibreriaException {
		boolean esEliminado = false;
		if(libros.contains(libro)) {
			libros.remove(libro);
			 esEliminado = true;
		} else {
			throw new LibreriaException("Este libro no exise.");
		}
		return false;
	}
	
	public void consultarLibros(Libros libro) throws LibreriaException {
		boolean esConsultado = false;
		if(libros.contains(libro)) {
			System.out.println(libro.toString());
			esConsultado = true;
		} else {
			throw new LibreriaException("Este libro no exise.");
		}
	}
	
	public Libros leerLibro(String ISBN) {
		Libros libro1 = null;
		boolean encontrado = false;
		Iterator<Libros> l = libros.iterator();
		while(!encontrado && l.hasNext()) {
			Libros libro2 = l.next();
			if(libro2.getISBN().equals(ISBN)) {
				libro1 = libro2;
				encontrado = true;
			}
		}
		return libro1;
	}
}
