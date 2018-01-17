package service;

import java.util.List;

import dao.*;

public interface IService {

	public void ajouter(etudiant e);
	public void supprimer(etudiant e);
	public etudiant selectionerId(int id);
	public List<etudiant> selectionertt();
	public void modifier(etudiant e);
	
}
