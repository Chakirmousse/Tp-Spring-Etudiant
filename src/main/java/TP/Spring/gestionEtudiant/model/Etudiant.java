package TP.Spring.gestionEtudiant.model;

public class Etudiant {
	
	
	private int Id;
	private String Nom;
	private String Prenom;
	public int getId() {
		return Id;
	}
	public void setId(int Id ) {
		 this.Id=Id ;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		this.Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}
	@Override
	public String toString() {
		return "Etudiant [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}
	
	

}
