package com.ninja;

public class Knapshack {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		
		int val[] = new int[] { 50, 60, 100 };
		int wt[] = new int[] { 3, 6, 8 };
		int W = 10;
		int N = val.length;
		
		System.out.println("Exec");
		
		
		System.out.println(KnapsackBF.knapSack(W, wt, val, N));
		System.out.println("Completed KnapsackBF");
		
		
		System.out.println(KnapsackDP.knapSack(W, wt, val, N));
		System.out.println("Completed KnapsackDP");

	}
	
	

}
