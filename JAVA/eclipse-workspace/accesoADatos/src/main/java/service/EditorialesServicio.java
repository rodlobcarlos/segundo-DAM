package service;

import java.util.Set;

import model.Editoriales;
import model.LibreriaException;
import repository.EditorialRepository;

public class EditorialesServicio {

    private EditorialRepository editorialRep;

    public EditorialesServicio(EditorialRepository editorialRep) {
        super();
        this.editorialRep = new EditorialRepository();
    }

    public EditorialRepository getEditorialRep() {
        return editorialRep;
    }

    public void setEditorialRep(EditorialRepository editorialRep) {
        this.editorialRep = editorialRep;
    }

    public void añadirEditorial(Editoriales e) {
    	editorialRep.añadirEditorial(e);
    }

    public void actualizarEditorial(Editoriales e) {
        try {
        	editorialRep.actualizarEditorial(e);
        } catch (LibreriaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Editoriales consultarEditorial(Editoriales e) {
        try {
            editorialRep.consultarEditorial(e);
        } catch (LibreriaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void eliminarEditorial(Editoriales e) {
        try {
            editorialRep.eliminarEditorial(e);
        } catch (LibreriaException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Set<Editoriales> listarEditoriales() {
        try {
            editorialRep.listarEditoriales();
        } catch (LibreriaException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}

