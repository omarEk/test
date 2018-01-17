package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class etudiantDAO implements IetudiantDAO {
	
	private Connection conn=Connexion.getConnection();
	
	public etudiant selectByid(int ide)
	{etudiant e=new etudiant();
		String query="SELECT * FROM etudiant WHERE id=?";
	try
	{
		PreparedStatement st=conn.prepareStatement(query);
		st.setInt(1, ide);
		ResultSet res=st.executeQuery();
		
while(res.next())
{
	e.setId(ide);
	e.setNom(res.getString("nom"));
	e.setPrenom(res.getString("prenom"));
	e.setAge(res.getInt("age"));
	}
res.close();
st.close();
	}
	catch(SQLException E){
		E.getStackTrace();
		
	}
	return e;
	}
	
	
	public List<etudiant> selectAll()
	{List<etudiant> l=new LinkedList<etudiant>();
	try
	{Statement st=conn.createStatement();
	ResultSet res=st.executeQuery("SELECT * FROM etudiant");
	while(res.next())
	{
		etudiant e=new etudiant(res.getString("nom"),res.getString("prenom"),res.getInt("age"));
		e.setId(res.getInt("id"));
		
		l.add(e);
	}
		res.close();
		st.close();
	}
	catch(SQLException e)
	{e.getStackTrace();}
		return l;
	}
	
	
	public void insert(etudiant e)
	{
		String query="INSERT INTO etudiant("+"id,"+"nom,"+"prenom,"+"age)"+"VALUES("+"?,?,?,?)";
		try
		{
			PreparedStatement st=conn.prepareStatement(query);
			st.setInt(1,e.getId());
			st.setString(2,e.getNom());
			st.setString(3,e.getPrenom());
			st.setInt(4,e.getAge());
			st.executeUpdate();
			st.close();
		}
		catch(SQLException x){x.getStackTrace();}
	}
	
	
	public void delete(etudiant e)
	{
		String query="DELETE FROM etudiant WHERE id=?";
		try
		{PreparedStatement st=conn.prepareStatement(query);
		st.setInt(1,e.getId());
		st.executeUpdate();
		st.close();
		}catch(SQLException x)
		{
			x.getStackTrace();
		}
	}
	
	public void update(etudiant e)
	{
		String query="UPDATE etudiant SET nom=?,"+"prenom=?,"+"age=? WHERE id=?";
		try
		{
			PreparedStatement st=conn.prepareStatement(query);
			st.setString(1,e.getNom());
			st.setString(2, e.getPrenom());
			st.setInt(3, e.getAge());
			st.setInt(4,e.getId());
			st.executeUpdate();
			st.close();
		}
		catch(SQLException x)
		{x.getStackTrace();}
	}
}
