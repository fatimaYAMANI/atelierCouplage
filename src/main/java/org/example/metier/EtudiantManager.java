package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;

import java.util.Map;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO;

    public Etudiant addEtudiant(Etudiant etudiant) {
        // Vérifier si l'email est déjà utilisé
        for (Etudiant e : etudiantDAO.getAllEtudiants().values()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                return null; // Email déjà utilisé, ne pas ajouter l'étudiant
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public Etudiant getEtudiant(int id) {
        return etudiantDAO.getEtudiant(id);
    }

    public Map<Integer, Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }

    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantDAO.updateEtudiant(etudiant);
    }
}