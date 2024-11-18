package org.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EtudiantDAO implements IEtudiantDao {
    private List<Etudiant> etudiants = new ArrayList<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }

    @Override
    public Etudiant getEtudiant(int id) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Etudiant> getAllEtudiants() {
        Map<Integer, Etudiant> etudiantsMap = new HashMap<>();
        for (Etudiant e : etudiants) {
            etudiantsMap.put(e.getId(), e);
        }
        return etudiantsMap;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        Etudiant existingEtudiant = getEtudiant(etudiant.getId());
        if (existingEtudiant != null) {
            existingEtudiant.setNom(etudiant.getNom());
            existingEtudiant.setPrenom(etudiant.getPrenom());
            existingEtudiant.setEmail(etudiant.getEmail());
            return existingEtudiant;
        }
        return null;
    }
}