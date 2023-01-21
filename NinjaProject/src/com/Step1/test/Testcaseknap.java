package com.ninja.test;

import com.ninja.KnapsackBF;

public class Testcaseknap {
	//
	int val[] = new int[] { 50, 60, 100 };
	int wt[] = new int[] { 3, 6, 8 };
	int W = 10;
	int N = val.length;

	@org.junit.Test(timeout = 3000)
	public void test_1(){
		System.out.println("======Unit Test Case =======");
		int result = KnapsackBF.knapSack(W, wt, val,N);
		org.junit.Assert.assertEquals( 110, result);
		System.out.println("Test passed");

	}
	@org.junit.Test(timeout = 3000)
	public void test_2()  {
		System.out.println("Postive test case ");
		int result = KnapsackBF.knapSack(W, wt, val, N);
		org.junit.Assert.assertEquals( 110, result);
		System.out.println("Passed, Expected results  : "+ result);


	}

	@org.junit.Test(expected = java.lang.AssertionError.class)
	public void test_3()  {
		System.out.println("negative test - input double for N ");
		int result = KnapsackBF.knapSack(W, wt, val, (int) 3.5);
		org.junit.Assert.assertSame("java.lang.Exception.classs", result);


	}

	@org.junit.Test(expected = java.lang.AssertionError.class)
	public void test_4()  {
		System.out.println("negative test - input double for N and Val ");
		int result = KnapsackBF.knapSack(10, new int[] { 3, 6, 8 },  new int[] { 50, (int) 60.10, 100 }, (int) 3.5);
		org.junit.Assert.assertSame("java.lang.Exception.classs", result);
	}

	@org.junit.Test(timeout = 3000)
    public void test_5()  {
    	System.out.println("Postive test - with + parameter ");
    	int result = KnapsackBF.knapSack(10, new int[] { 3, 6, 8, 13, 16, 18 },  new int[] { 200, 400, 100, 120, 400, 800}, 6);
        org.junit.Assert.assertEquals( 600, result);
        System.out.println("Passed, Expected results  : " + result);
    }


    @org.junit.Test(timeout = 3000)
    public void test_6()  {
      	System.out.println("Postive test - with + parameter ");
    	int result = KnapsackBF.knapSack(10000, new int[] { 30000, 60000, 700, 1300, 1600, 18000 },  new int[]  { 200000, 3, 4, 120000, 4000, 800}, 6);
        org.junit.Assert.assertEquals( 124004, result);
        System.out.println("Passed, Expected results  : " + result);
    }


    @org.junit.Test(timeout = 3000)
    public void test_7() {
     	System.out.println("Postive test - with + parameter ");
    	int result = KnapsackBF.knapSack(10, new int[] { 30, 60, 70, 130, 160, 180 },  new int[] { 2, 3, 4, 120000, 4000, 800}, 6);
        org.junit.Assert.assertEquals( 0, result);
        System.out.println("Passed, Expected results  : " + result);
    }



    @org.junit.Test(timeout = 3000)
    public void test_8() {
    	System.out.println("negative  test - with  wrong validation ");
    	int result = KnapsackBF.knapSack(10, new int[] { 31, 60, 70, 130, 160, 180 },  new int[] { 2, 3, 4, 120000, 4000, 800}, 6);
        org.junit.Assert.assertEquals( 0, result);
        System.out.println("Passed Expected results  : " + result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() {
    	System.out.println("negative  test - with  wrong validation ");
    	int result = KnapsackBF.knapSack(10, new int[] { 31, 60, 70, 131, 160, 180 },  new int[] { 2, 3, 4, 120000, 4000, 800}, 6);
        org.junit.Assert.assertEquals( 0, result);
        System.out.println("Passed Expected results  : " + result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() {
    	System.out.println("negative  test - with negative weight ");
    	int result = KnapsackBF.knapSack(10, new int[] { 31, 60, 70, 131, 160, 190 },  new int[] { 2, 3, 4, -120000, 4000, 800}, 6);
        org.junit.Assert.assertEquals( 0, result);
        System.out.println("Passed - with negative weight :" + result);
    }



    @org.junit.Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test_11() {
    	int result = KnapsackBF.knapSack(10, new int[] { 30, 9-60, 70, 130, 160, 160 },  new int[] { 2, 3, 4, 120000, 4000, 800}, 6);
    	org.junit.Assert.assertSame("ArrayIndexOutOfBoundsException.class", result);

    	  }



    @org.junit.Test(expected = java.lang.AssertionError.class)
    public void test_12() {

    	int result = KnapsackBF.knapSack(10, new int[] { 30, 6-0, 70, 130, 160, 160 },  new int[] { 2, 3, 4, 120000, -4000, 800}, 6);
    	org.junit.Assert.assertSame("java.lang.Exception.classs", result);


    }


	@org.junit.Test(expected = java.lang.AssertionError.class)
	public void test_13()  {
		int result = KnapsackBF.knapSack(10, wt,  new int[] { 50, (int) 60.10, 100,200 }, N);
    	org.junit.Assert.assertSame("java.lang.Exception.classs", result);

	}
}






