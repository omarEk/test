package dao;

public class etudiant {
	
	private int id=0;
	private String nom;
	private String prenom;
	private int age;
	
	public etudiant(String name,String lastname,int agee)
	{
		id++;nom=name;prenom=lastname;age=agee;
	}
	
	public etudiant(int id, String nom, String prenom, int age) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public etudiant()
	{id++;}

	public void affiche()
	{
		System.out.println("id="+id);
		System.out.println("nom="+nom);
		System.out.println("prenom="+prenom);
		System.out.println("age="+age);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

}
