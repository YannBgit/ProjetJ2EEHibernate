package amis.test;

import java.util.HashSet;
import java.util.Set;
import amis.dao.DaoEtudiantImpl;
import amis.entity.Adresse;
import amis.entity.Cours;
import amis.entity.Etudiant;
import amis.entity.Licence;
import amis.entity.Master;

public class Main
{
	public static void main(String[] args)
	{
		// SETUP
		
		// Etudiant 1
		Etudiant e1 = new Etudiant();
		e1.setNom("Martin Titi");
		
		// Etudiant 2
		Etudiant e2 = new Etudiant();
		e2.setNom("Jesus Quintero");
		
		// Etudiant 3
		Etudiant e3 = new Etudiant();
		e3.setNom("Pierre Dupont");
		
		// Adresse 1
		Adresse a1 = new Adresse("Boulevard Titi", "Martinville");
		e1.setAdresse(a1);
		
		// Adresse 2
		Adresse a2 = new Adresse("Rue Quintero", "Jesusville");
		e2.setAdresse(a2);
		
		// Adresse 3
		Adresse a3 = new Adresse("Rue Du Lac", "Toulouse");
		e3.setAdresse(a3);
		
		// Cours
		Cours c1 = new Cours("TP Chimie", 6, 25, "Chimie");
		Cours c2 = new Cours("Langage C", 8, 25, "Informatique");
		Cours c3 = new Cours("J2EE", 8, 20, "Informatique");
		Cours c4 = new Cours("Algèbre", 8, 25, "Mathématiques");
		Cours c5 = new Cours("Python", 6, 20, "Informatique");
		Cours c6 = new Cours("Anglais", 6, 15, "Langues");
		
		// Liste de cours 1
		Set<Cours> lc1 = new HashSet<Cours>();
	    lc1.add(c1);
	    lc1.add(c2);
	    lc1.add(c4);
	    e1.setCoursSuivis(lc1);
	    
	    // Liste de cours 2
	    Set<Cours> lc2 = new HashSet<Cours>();
	    lc2.add(c2);
	    lc2.add(c3);
	    lc2.add(c5);
	    lc2.add(c6);
	    e2.setCoursSuivis(lc2);
	    
	    // Liste de cours 3
	    Set<Cours> lc3 = new HashSet<Cours>();
	    lc3.add(c1);
	    lc3.add(c2);
	    lc3.add(c3);
	    lc3.add(c4);
	    lc3.add(c5);
	    lc3.add(c6);
	    e2.setCoursSuivis(lc2);
		
	    // Licence
		Licence l = new Licence();
		e1.setNiveauEtude(l);
		
		// Master
		Master m = new Master();
		e2.setNiveauEtude(m);
		e3.setNiveauEtude(m);
		
		// PERSISTANCE
		
		// Insertion des 3 étudiants
		DaoEtudiantImpl persisterE = new DaoEtudiantImpl();
		persisterE.inserer(e1);
		persisterE.inserer(e2);
		persisterE.inserer(e3);
	}
}