/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Nesspreso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import implement.NesspresoImplementService;
import static org.junit.Assert.*;

/**
 *
 * @author Marcela
 */
public class NesspresoImplementServiceTest {
    
    public NesspresoImplementServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Menu method, of class NesspresoImplementService.
     */
//    @Test
//    public void testMenu() {
//        System.out.println("Menu");
//        boolean c = false;
//        NesspresoImplementService instance = new NesspresoImplementService();
//        boolean expResult = true;
//        boolean result = instance.Menu(c);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        if(expResult != result){
//            fail("The test case is a prototype.");
//        }
//    }
    

    @Test
    public void testActualCap() {
        System.out.println("ActualCap");
        int b = 0;
        int a = 10;
        NesspresoImplementService instance = new NesspresoImplementService();
        int expResult = 10;
        int result = instance.ActualCap(b, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testServCup() {
        System.out.println("ServCup");
        int b = 10;
        int cup = 20;
        NesspresoImplementService instance = new NesspresoImplementService();
        int expResult = 0;
        int result = instance.ServCup(b, cup);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of EmptyPot method, of class NesspresoImplementService.
     */
    @Test
    public void testEmptyPot() {
        System.out.println("EmptyPot");
        int b = 100;
        NesspresoImplementService instance = new NesspresoImplementService();
        int expResult = 0;
        int result = instance.EmptyPot(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of EnterCoffee method, of class NesspresoImplementService.
     */
    @Test
    public void testEnterCoffee() {
        System.out.println("EnterCoffee");
        int a = 10;
        int b = 5;
        int cafe_ingresado = 5;
        NesspresoImplementService instance = new NesspresoImplementService();
        int expResult = 10;
        int result = instance.EnterCoffee(a, b, cafe_ingresado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult != result){
            fail("The test case is a prototype.");
        }
    }
    
}
