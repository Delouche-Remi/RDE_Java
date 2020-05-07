package com.cesi.bankonet;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Delouche Rémi
 */
public class CompteEpargneTest extends TestCase {
    CompteEpargne compteEpargne = new com.cesi.bankonet.CompteEpargne("1","Compte Epargne 1",1000.00,0.75);

    public void testCompteEpargneDebitTest() {
        compteEpargne.Debiter(100);
        assertEquals(900.00,compteEpargne.getSolde());
    }
    
    public void testCompteEpargneDebit2Test() {
        compteEpargne.Debiter(-100);
        assertEquals(1000.00,compteEpargne.getSolde());
    }
    
    public void testCompteEpargneDebit3Test() {
        compteEpargne.Debiter(1100);
        assertEquals(0.00,compteEpargne.getSolde());
    }
        
    public void testCompteEpargneCreditTest() {
        compteEpargne.Crediter(100);
        assertEquals(1100.00,compteEpargne.getSolde());
    }
    
    public void testCompteEpargneCredit2Test() {
        compteEpargne.Crediter(-100);
        assertEquals(1000.00,compteEpargne.getSolde());
    }
    
    public void testCompteEpargneCalculInteret() {
        compteEpargne.calculerInterets();
        assertEquals(1007.5,compteEpargne.getSolde());
    }
}