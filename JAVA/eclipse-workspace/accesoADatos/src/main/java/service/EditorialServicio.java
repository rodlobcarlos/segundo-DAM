package service;

import java.util.Set;

import Libreria.modelo.*;
import Libreria.repositorio.*;
import model.Editorial;
import model.LibreriaException;

public class EditorialServicio {

	    private EditorialServicio editorialRep;

	    public EditorialServicio() {
	        super();
	        this.editorialRep = new EditorialServicio();
	    }

	    public EditorialServicio getEditorialRep() {
	        return editorialRep;
	    }

	    public void setEditorialRep(EditorialServicio editorialRep) {
	        this.editorialRep = editorialRep;
	    }

	    public void añadirEditorial(Editorial e) {
	    	editorialRep.añadirEditorial(e);
	    }

	    public void actualizarEditorial(Editorial e) {
	        try {
	        	editorialRep.actualizarEditorial(e);
	        } catch (LibreriaException ex) {
	            System.out.println(ex.getMessage());
	        }
	    }

	    public void consultarEditorial(Editorial e) {
	        try {
	            editorialRep.consultarEditorial(e);
	        } catch (LibreriaException ex) {
	            System.out.println(ex.getMessage());
	        }
	    }

	    public void eliminarEditorial(Editorial e) {
	        try {
	            editorialRep.eliminarEditorial(e);
	        } catch (LibreriaException ex) {
	            System.out.println(ex.getMessage());
	        }
	    }

	    public void leerEditorial(String CIF) {
	            editorialRep.leerEditorial(CIF);
	    }
}

