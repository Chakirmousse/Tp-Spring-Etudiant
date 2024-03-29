package TP.Spring.gestionEtudiant.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import TP.Spring.gestionEtudiant.dao.EtudiantDao;

import TP.Spring.gestionEtudiant.model.Etudiant;

@Repository



public class MemoireEtuDao implements EtudiantDao {
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void persister(Etudiant etudiant) {
        if (etudiant == null) {
            throw new IllegalArgumentException("etudiant ne peut pas être null.");
        }

        if (estPresent(etudiant)) {
            throw new IllegalStateException("etudiant est deja  dans la base de données.");
        }

        etudiants.add(etudiant);
        System.out.println("Étudiant persisté avec succès : " + etudiant);
    }

    private boolean estPresent(Etudiant etudiant) {
        for (Etudiant e : etudiants) {
            if (e.equals(etudiant)) {
                return true;
            }
        }
        return false;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}

