package org.example.dao;

import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionary implements IEtudiantDao {
    private Map<Integer, Etudiant> etudiantsMap = new HashMap<>();

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    @Override
    public Etudiant getEtudiant(int id) {
        return etudiantsMap.get(id);
    }

    @Override
    public Map<Integer, Etudiant> getAllEtudiants() {
        return etudiantsMap;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }
}