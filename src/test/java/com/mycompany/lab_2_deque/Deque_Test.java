/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_2_deque;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yaroslavtrykoz
 */
public class Deque_Test {
    
    private static Deque dq = null;
    
    @BeforeClass
    public static void setUpClass() {
        dq = new Deque(5);
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Class");
    }
    @Test
    public void testA(){
        System.out.println("If deque is empty: "); 
        boolean expected = true;
        assertEquals(expected,dq.isEmpty());
        System.out.println("Success!\n");
    }
}
