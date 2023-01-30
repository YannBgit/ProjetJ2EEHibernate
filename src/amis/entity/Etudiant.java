package amis.entity;

import java.util.Set;

public class Etudiant
{
	private Long etudiantId;
	private String nom;
	private Adresse adresse;
	private Set<Cours> coursSuivis;
	private Niveau niveauEtude;
	
	public Etudiant()
	{
	}
	
	public void setEtudiantId(Long etudiantId)
	{
		this.etudiantId = etudiantId;
	}
	
	public Long getEtudiantId()
	{
		return this.etudiantId;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}
	
	public Adresse getAdresse()
	{
		return this.adresse;
	}
	
	public void setCoursSuivis(Set<Cours> coursSuivis)
	{
		this.coursSuivis = coursSuivis;
	}
	
	public Set<Cours> getCoursSuivis()
	{
		return this.coursSuivis;
	}
	
	public void setNiveauEtude(Niveau niveauEtude)
	{
		this.niveauEtude = niveauEtude;
	}
	
	public Niveau getNiveauEtude()
	{
		return this.niveauEtude;
	}
	
	public void copieEtudiant(Etudiant etudiant)
	{
		this.nom = etudiant.getNom();
		this.adresse = etudiant.getAdresse();
		this.coursSuivis = etudiant.getCoursSuivis();
		this.niveauEtude = etudiant.getNiveauEtude();
	}

	@Override
	public String toString()
	{
		return "Etudiant [idEtudiant=" + etudiantId + ", nom=" + nom + ", adresse=" + adresse + ", niveauEtude=" + niveauEtude + "]";
	}
}