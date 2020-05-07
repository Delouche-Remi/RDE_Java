package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
public class CompteCourant extends Compte{
    private double montantDecouvertAutorise;
    
    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise) {
        super.numero = numero;
        super.intitule = intitule;
        super.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
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
    
    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    @Override
    public String toString() {
        return "CompteCourant{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + ", montantDecouvertAutorise=" + montantDecouvertAutorise + '}';
    }
}