package TP.Spring.gestionEtudiant.dao.impl;


import org.springframework.stereotype.Repository;

import TP.Spring.gestionEtudiant.dao.EtudiantDao;
import TP.Spring.gestionEtudiant.model.Etudiant;

@Repository
public class MysqlEtDao implements EtudiantDao {
	
	
@Override 

public void persister(Etudiant etudiant )
{
	System.out.println("Ajouter avec succes");
}

}
