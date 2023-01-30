package amis.entity;

public abstract class Niveau
{
	private Long niveauId;
	private String nom;
	private Integer annees;
	
	public Niveau()
	{
	}
	
	public Niveau(String nom, Integer annees)
	{
		this.nom = nom;
		this.annees = annees;
	}
	
	public void setNiveauId(Long niveauId)
	{
		this.niveauId = niveauId;
	}
	
	public Long getNiveauId()
	{
		return this.niveauId;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setAnnees(Integer annees)
	{
		this.annees = annees;
	}
	
	public Integer getAnnees()
	{
		return this.annees;
	}
	
	public void copieNiveau(Niveau niveau)
	{
		this.nom = niveau.getNom();
		this.annees = niveau.getAnnees();
	}

	@Override
	public String toString()
	{
		return "Niveau [idNiveau=" + niveauId + ", nom=" + nom + ", annees=" + annees + "]";
	}
}