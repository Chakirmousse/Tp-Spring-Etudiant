package TP.Spring.gestionEtudiant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import TP.Spring.gestionEtudiant.Idgenerateur.IdGenerateur;
import TP.Spring.gestionEtudiant.dao.EtudiantDao;
import TP.Spring.gestionEtudiant.model.Etudiant;
@Service
public class Eservice {
	
	  @Autowired
	    @Qualifier("MemoireEtutDao")
	private EtudiantDao EtudiantDAO;
	
	  @Autowired
	    @Qualifier("AutoIncriGenerate")
	private IdGenerateur Idgenerateur ;
	
	
	
	public void Ajouter(Etudiant etudiant)
	
	{
		
	    etudiant.setId(Idgenerateur.generateurId());

        if (etudiant.getNom() == null || etudiant.getNom().isEmpty()) {
            throw new IllegalArgumentException("Le nom de etudiant est requis");
        }

        if (etudiant.getPrenom() == null || etudiant.getPrenom().isEmpty()) {
            throw new IllegalArgumentException("Le prenom de etudiant est requis");
        }

		   
		   
	        EtudiantDAO.persister(etudiant);

	}

		
	
	

}
