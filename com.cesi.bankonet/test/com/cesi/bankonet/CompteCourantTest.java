package com.cesi.bankonet;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.cesi.bankonet.*;

/**
 *
 * @author Delouche Rémi
 */
public class CompteCourantTest extends TestCase {
    CompteCourant compteCourantTestCredit = new com.cesi.bankonet.CompteCourant("1","Compte Courant 1",130.00,100.00);

    public void testNombreCompteCourant() throws Exception {
        assertEquals(6,compteCourantTestCredit.getNbComptesCourants());
    }
    
    public void testCrediter100() throws Exception {
        compteCourantTestCredit.Crediter(1000);
        assertEquals(1130.00,compteCourantTestCredit.getSolde());
    }
    
    public void testCrediterM1000() throws Exception {
        compteCourantTestCredit.Crediter(-1000);
        assertEquals(130.00,compteCourantTestCredit.getSolde());
    }
    
    public void testDebiter100() throws Exception {
        compteCourantTestCredit.Debiter(100);
        assertEquals(30.00,compteCourantTestCredit.getSolde());  
    }
    
    public void testDebiterM100() throws Exception {
        compteCourantTestCredit.Debiter(-100);
        assertEquals(130.00,compteCourantTestCredit.getSolde());
    }
    
    public void testCompteCourantSoldeNegatif() throws Exception {
        CompteCourant compteCourantTestCreditNegatif = new com.cesi.bankonet.CompteCourant("2","Compte Courant 2",-130.00,100.00);
        assertEquals(0.0,compteCourantTestCreditNegatif.getSolde());
    }
}