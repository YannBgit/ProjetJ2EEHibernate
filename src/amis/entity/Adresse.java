package amis.entity;

public class Adresse
{
	private String intitule;
	private String ville;
	
	public Adresse()
	{
	}
	
	public Adresse(String intitule, String ville)
	{
		this.intitule = intitule;
		this.ville = ville;
	}
	
	public void setIntitule(String intitule)
	{
		this.intitule = intitule;
	}
	
	public String getIntitule()
	{
		return this.intitule;
	}
	
	public void setVille(String ville)
	{
		this.ville = ville;
	}
	
	public String getVille()
	{
		return this.ville;
	}

	@Override
	public String toString()
	{
		return "Adresse [intitule=" + intitule + ", ville=" + ville + "]";
	}
}