/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab_2_deque;

/**
 *
 * @author yaroslavtrykoz
 */
public class Deque {
    static final int MAX = 10; 
    int  arr[]; 
    int  front; 
    int  rear; 
    int  size;
    
    public Deque(int size) 
    { 
        arr = new int[MAX]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    }
    
    public int[] arrayShow(){
       int checkArr[] = new int[this.size];
       for(int i = 0; i< this.size; i++){
        checkArr[i] = arr[i];
       }
       return checkArr;
   }
    
    // Checks whether Deque is full or not. 
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
   
    // Checks whether Deque is empty or not. 
    boolean isEmpty () 
    { 
        return (front == -1); 
    }
}
