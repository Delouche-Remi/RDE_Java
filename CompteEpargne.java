package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
class CompteEparge {
    private String numero;
    private String intitule;
    private double solde;
    private double tauxInteret;
    private static int nbComptesEpargne = 0;
    
    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
        this.nbComptesEpargne++;
    }
    
    public void Debiter(double somme) {
        if (somme > 0) {
            if (this.solde >= somme) {
                this.solde -= somme;}
            else {
                System.out.println("Operation impossible.");}}
        else {
            System.out.println("La somme saisie n'est pas valide.");}
    }
    
    public void Crediter(double somme) {
        if (somme > 0) {
            this.solde += somme;}
        else {
            System.out.println("La somme saisie n'est pas valide.");}
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public double tauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public static int getNbComptesEpargne() {
        return nbComptesEpargne;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", tauxInteret=" + tauxInteret + '}';
    }
    
    public double calculerInterets() {
        return tauxInteret*solde;
    }
}