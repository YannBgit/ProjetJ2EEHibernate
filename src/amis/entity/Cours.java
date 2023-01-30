package amis.entity;

public class Cours
{
	private Long coursId;
	private String intitule;
	private Integer ECTS;
	private Integer nbHeures;
	private String departement;
	
	public Cours()
	{
	}
	
	public Cours(String intitule, Integer ECTS, Integer nbHeures, String departement)
	{
		this.intitule = intitule;
		this.ECTS = ECTS;
		this.nbHeures = nbHeures;
		this.departement = departement;
	}
	
	public void setCoursId(Long coursId)
	{
		this.coursId = coursId;
	}
	
	public Long getCoursId()
	{
		return this.coursId;
	}
	
	public void setIntitule(String intitule)
	{
		this.intitule = intitule;
	}
	
	public String getIntitule()
	{
		return this.intitule;
	}
	
	public void setECTS(Integer ECTS)
	{
		this.ECTS = ECTS;
	}
	
	public Integer getECTS()
	{
		return this.ECTS;
	}
	
	public void setNbHeures(Integer nbHeures)
	{
		this.nbHeures = nbHeures;
	}
	
	public Integer getNbHeures()
	{
		return this.nbHeures;
	}
	
	public void setDepartement(String departement)
	{
		this.departement = departement;
	}
	
	public String getDepartement()
	{
		return this.departement;
	}
	
	public void copieCours(Cours cours)
	{
		this.intitule = cours.getIntitule();
		this.ECTS = cours.getECTS();
		this.nbHeures = cours.getNbHeures();
		this.departement = cours.getDepartement();
	}

	@Override
	public String toString()
	{
		return "Cours [idCours=" + coursId + ", intitule=" + intitule + ", ECTS=" + ECTS + ", nbHeures=" + nbHeures + ", departement=" + departement + "]";
	}
}