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

	public LibrosRepository() {
		super();
		this.libros = new HashSet<Libros>();
	}

	public void añadirLibro(Libros libro) {
		if(libros.contains(libro)) {
			System.out.println("El libro ya está añadido.");
		}else {
			libros.add(libro);
			System.out.println("Libro añadido: " + libro);		
		}
	}
	
	public boolean actualizarLibro(Libros libro) throws LibreriaException {
<<<<<<< HEAD
<<<<<<< Updated upstream
		boolean esActualizado = false;
		if(libros.contains(libro)) {
			esActualizado = true;

		} else {
			throw new LibreriaException("Este libro no existe.");
=======
		Libros p1 = leerLibro(libro.getISBN());
		libros.remove(p1);
		libros.add(libro);
		boolean esActualizado = true;
		if(p1 == null) {
			esActualizado = false;
			throw new LibreriaException("Este libro ya existe.");
>>>>>>> Stashed changes
=======
		boolean esActualizado = true;
		Libros l = leerLibro(libro.getISBN());
		if(l == null) {
			esActualizado = false;
			throw new LibreriaException("Este libro no existe.");
		} else {
			libros.remove(l);
			libros.add(libro);
>>>>>>> d0674068106f022f842f2e76e99b01a65a8c648d
		}
		return esActualizado;
	}
	
<<<<<<< Updated upstream
	public boolean eliminarLibro(Libros libro) throws LibreriaException {
		boolean esEliminado = false;
		if(libros.contains(libro)) {
			libros.remove(libro);
			 esEliminado = true;
		} else {
			throw new LibreriaException("Este libro no exise.");
=======
	public void eliminarLibro(Libros libro) throws LibreriaException {
		Libros p2 = leerLibro(libro.getISBN());
		libros.remove(p2);
		boolean esEliminado = true;
		if(p2 == null) {
			throw new LibreriaException("Este libro ya existe.");
>>>>>>> Stashed changes
		}
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
	
	public Libros leerLibro(String ISBN) throws LibreriaException {
		Libros libro1 = null;
		boolean encontrado = false;
		Iterator<Libros> l = libros.iterator();
		while(!encontrado && l.hasNext()) {
			Libros libro2 = l.next();
			if(libro2.getISBN().equals(ISBN)) {
				libro1 = libro2;
				encontrado = true;
			} else {
				throw new LibreriaException("Este libro no exise.");
			}
		}
		return libro1;
	}
}
