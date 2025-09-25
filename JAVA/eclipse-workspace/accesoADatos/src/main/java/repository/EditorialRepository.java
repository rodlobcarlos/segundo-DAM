package repository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.Editoriales;
import model.LibreriaException;

public class EditorialRepository {

	private Set<Editoriales> editoriales;

	public Set<Editoriales> getEditorial() {
		return editoriales;
	}

	public void setEditorial(Set<Editoriales> editorial) {
		this.editoriales = editorial;
	}

	public EditorialRepository() {
		super();
		this.editoriales = new HashSet<Editoriales>();
	}

	public boolean añadirEditorial(Editoriales editorial) {
		boolean esAñadido = false;
		if(editoriales.contains(editorial)) {
			System.out.println("El libro ya está añadido.");
		}else {
			editoriales.add(editorial);
			esAñadido = true;
			System.out.println("Libro añadido: " + editorial);		
		}
		return esAñadido;
	}
	
	public boolean actualizarEditorial(Editoriales ed) throws LibreriaException {
		boolean esActualizado = true;
		Editoriales e = leerEditorial(ed.getCif());
		if(e == null) {
			esActualizado = false;
			throw new LibreriaException("Este libro no existe.");
		} else {
			editoriales.remove(e);
			editoriales.add(e);
		}
		return esActualizado;
	}
	
	public boolean eliminarEditorial(Editoriales editorial) throws LibreriaException {
		boolean esEliminado = false;
		if(editoriales.contains(editorial)) {
			editoriales.remove(editorial);
			 esEliminado = true;
		} else {
			throw new LibreriaException("Este libro no exise.");
		}
		return false;
	}
	
	public void consultarEditorial(Editoriales editorial) throws LibreriaException {
		boolean esConsultado = false;
		if(editoriales.contains(editorial)) {
			System.out.println(editorial.toString());
			esConsultado = true;
		} else {
			throw new LibreriaException("Este libro no exise.");
		}
	}
	
	public Editoriales leerEditorial(String cif) {
		Editoriales editorial1 = null;
		boolean encontrado = false;
		Iterator<Editoriales> l = editoriales.iterator();
		while(!encontrado && l.hasNext()) {
			Editoriales editorial2 = l.next();
			if(editorial2.getCif().equals(cif)) {
				editorial1 = editorial2;
				encontrado = true;
			}
		}
		return editorial1;
	}
}
