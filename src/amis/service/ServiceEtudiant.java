package amis.service;

import amis.entity.Cours;
import amis.entity.Etudiant;
import amis.entity.Niveau;

public interface ServiceEtudiant
{
	void creerEtudiant(Etudiant etudiant);
	void supprimerEtudiant(Etudiant etudiant);
	void afficherCoursSuivis(Etudiant etudiant);
	void chercherListeEtudiantsPourNiveau(Niveau niveau);
	void ajouterCoursAEtudiant(Etudiant etudiant, Cours cours);
}