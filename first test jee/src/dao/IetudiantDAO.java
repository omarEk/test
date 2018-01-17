package dao;

import java.sql.Connection;
import java.util.List;

public interface IetudiantDAO {
	public etudiant selectByid(int ide);
	public List<etudiant> selectAll();
	public void insert(etudiant e);	
	public void delete(etudiant e);
	public void update(etudiant e);



}
