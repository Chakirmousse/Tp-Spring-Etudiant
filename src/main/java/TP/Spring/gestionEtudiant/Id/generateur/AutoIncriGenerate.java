package TP.Spring.gestionEtudiant.Id.generateur;
import org.springframework.stereotype.Component;

import TP.Spring.gestionEtudiant.Idgenerateur.IdGenerateur;


@Component
public class AutoIncriGenerate implements IdGenerateur {
	
	private long compteur;

	

	@Override
	public String generateurId() {
		// TODO Auto-generated method stub
		return  Long.toString(compteur++);
	}
	

}
