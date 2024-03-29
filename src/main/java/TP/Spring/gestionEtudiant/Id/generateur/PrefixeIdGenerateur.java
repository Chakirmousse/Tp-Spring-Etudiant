package TP.Spring.gestionEtudiant.Id.generateur;

import org.springframework.stereotype.Component;

import TP.Spring.gestionEtudiant.Idgenerateur.IdGenerateur;


@Component
public class PrefixeIdGenerateur implements IdGenerateur{

	private String prefix ; 
	private long compteur;
	
	@Override
	public String generateurId() {
		// TODO Auto-generated method stub
		return prefix+compteur++;
	}
	
	
	

}
