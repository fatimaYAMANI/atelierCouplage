package org.example.dao;

import java.util.Map;

public interface IEtudiantDao {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant getEtudiant(int id);
    Map<Integer, Etudiant> getAllEtudiants();
    Etudiant updateEtudiant(Etudiant etudiant);
}
