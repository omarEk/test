package service;

import java.util.List;

import dao.*;

public class Service implements IService {

	etudiantDAO ed=new etudiantDAO();
	
	public void ajouter(etudiant e) {
		ed.insert(e);
	}

	public void supprimer(etudiant e) {
        ed.delete(e);		
	}

	public etudiant selectionerId(int id) {
		return ed.selectByid(id);
	}

	public List<etudiant> selectionertt() {
		return ed.selectAll();
	}

	public void modifier(etudiant e) {
        ed.update(e);		
	}

	public void setEd(etudiantDAO edd) {
		this.ed = edd;
	}
	
	
	

}
