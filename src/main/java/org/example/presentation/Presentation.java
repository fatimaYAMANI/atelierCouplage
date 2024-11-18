package org.example.presentation;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        EtudiantManager etudiantManager = new EtudiantManager();
        etudiantManager.etudiantDAO = new org.example.dao.EtudiantDAO();

        // Créer et ajouter 4 étudiants
        Etudiant e1 = new Etudiant(1, "Doe", "John", "john.doe@example.com");
        Etudiant e2 = new Etudiant(2, "Dupont", "Marie", "marie.dupont@example.com");
        Etudiant e3 = new Etudiant(3, "Roux", "Pierre", "pierre.roux@example.com");
        Etudiant e4 = new Etudiant(4, "Garcia", "Sophia", "sophia.garcia@example.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        // Afficher tous les étudiants
        for (Etudiant etudiant : etudiantManager.getAllEtudiants().values()) {
            System.out.println(etudiant.getNom() + " " + etudiant.getPrenom() + " (" + etudiant.getEmail() + ")");
        }
    }
}