/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_2_deque;

import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;

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
    @Test
    public void testB() throws Exception{
        System.out.println("Insert elements at rear end  : '5' and '10' ");
        int expected[] = new int[]{5,10,0,0,0};
        dq.insertrear(5);
        dq.insertrear(10); 
        assertArrayEquals(expected, dq.arrayShow());
        System.out.println("Success!\n");
         
    }
    
    @Test
    public void testC(){
        System.out.println("Get rear element : "); 
        int expected = 10;
        assertEquals(expected, dq.getRear());
        System.out.println("Success!\n");
    }
    
    @Test
    public void testD() throws Exception{
        System.out.println("Inserting elements at front end: '15' and '8' "); 
        int expected[] = new int[]{5,10,0,8,15};
        dq.insertfront(15);
        dq.insertfront(8);
        assertArrayEquals(expected, dq.arrayShow());
        System.out.println("Success!\n");
    }
    
    @Test
    public void testE() throws Exception{
        System.out.println("Delete rear element: "); 
        int expected = 5;
        dq.deleterear();
        assertEquals(expected, dq.getRear());
        System.out.println("Success!\n");
    }
    
     @Test
    public void testF(){
        System.out.println("Get front element : "); 
        int expected = 8;
        assertEquals(expected, dq.getFront());
        System.out.println("Success!\n");
    }
    
    @Test
    public void testG() throws Exception{
        System.out.println("Delete front element: "); 
        int expected = 15;
        dq.deletefront();
        assertEquals(expected, dq.getFront());
        System.out.println("Success!\n");
    }
    
    @Test 
    public void testH(){
        System.out.println("If deque is full: "); 
        boolean expected = false;
        assertEquals(expected,dq.isFull());
        System.out.println("Success!\n");
    }
    
    @Test(expected = Exception.class)
    public void testI() throws Exception{
        System.out.println("Exception");
    for(int i = 0; i < dq.size; i++){
        dq.insertfront(15);
    }
    
    }
}
