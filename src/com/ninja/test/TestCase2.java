package com.ninja.test;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ninja.KnapsackBF;  
 
public class TestCase2 {  
	
	int val[] = new int[] { 50, 60, 100 };
	int wt[] = new int[] { 3, 6, 8 };
	int W = 10;
	int N = val.length;
 
   @BeforeClass  
   public static void setUpBeforeClass() throws Exception {  
       System.out.println("before class");  
   }  
   @Before  
   public void setUp() throws Exception {  
       System.out.println("before");  
   }  
 
   /*
   @Test  
   public void testFindMax(){  
       System.out.println("test case find max");  
       assertEquals(110,KnapsackBF.knapSack(W, wt, val, N));
      System.out.println("test case cube1");  
   }  
   */
   
   @Test  
   public void testCube(){  
       System.out.println("test case cube");  
       assertEquals(110,KnapsackBF.knapSack(W, wt, val, N));
      System.out.println("test case cube1"); 
   }  
   @Test  
   public void testReverseWord(){  
       System.out.println("test case reverse word");  
       assertEquals("111",KnapsackBF.knapSack(W, wt, val, N));
   }  
   @After  
   public void tearDown() throws Exception {  
       System.out.println("after");  
   }  
 
   @AfterClass  
   public static void tearDownAfterClass() throws Exception {  
       System.out.println("after class");  
   }  
 
}  