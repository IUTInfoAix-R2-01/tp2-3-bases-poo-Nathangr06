public class Personne{
	private String Nom;
	private String Prenom;
	
	public Personne(String Prenom, String Nom) {
		this.Prenom=Prenom;
		this.Nom=Nom;
	}
	
	public Personne(String Nom) {
		this.Prenom=Prenom;
		this.Nom=Nom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString() {
		return "Personne " + this.Nom + this.Prenom;
	}
	
}