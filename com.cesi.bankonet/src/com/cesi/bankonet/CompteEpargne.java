package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
public class CompteEpargne extends Compte{
    private double tauxInteret;
    
    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret) {
        super.numero = numero;
        super.intitule = intitule;
        super.solde = solde;
        this.tauxInteret = tauxInteret;
    }
    
    public void Crediter(double somme) {
        if (somme > 0) {
            this.solde += somme;}
        else {
            System.out.println("La somme saisie n'est pas valide.");}
    }

    public double tauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", tauxInteret=" + tauxInteret + '}';
    }
    
    public double calculerInterets() {
        return (tauxInteret*solde)/100;
    }
}