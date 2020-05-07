package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
class Client {
    private String identifiant;
    private String nom;
    private String prenom;
    
    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", tauxInteret=" + tauxInteret + '}';
    }
    
    public double calculerAvoirGlobal() {
        return tauxInteret*solde;
    }
}