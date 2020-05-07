package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
class CompteCourant {
    private String numero;
    private String intitule;
    private double solde;
    private double montantDecouvertAutorise;
    private static int nbComptesCourants = 0;
    
    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.nbComptesCourants++;
    }
    
    public void Debiter(double somme) {
        if (somme > 0) {
            if (this.montantDecouvertAutorise + this.solde >= somme) {
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

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public static int getNbComptesCourants() {
        return nbComptesCourants;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", montantDecouvertAutorise=" + montantDecouvertAutorise + '}';
    }
}