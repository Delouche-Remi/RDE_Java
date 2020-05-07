package com.cesi.bankonet;

/**
 *
 * @author Delouche Rémi
 */
public abstract class Compte {
    protected String numero;
    protected String intitule;
    protected double solde;
    
    public Compte() {}
    
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

    @Override
    public String toString() {
        return "Compte{" + "numero=" + numero + ", intitule=" + intitule + ", solde=" + solde + '}';
    }
    
}