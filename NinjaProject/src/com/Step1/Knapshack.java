
package com.ninja;
public class Knapshack {


	public static void main(String[] args) {
		// TODO Auto-generated method stub\


		int val[] = new int[] { 50, 60, 100 };
		int wt[] = new int[] { 3, 6, 8 };
		int W = 10;
		int N = val.length;

		System.out.println("###########################################################################");
		System.out.println("This is bruteforce solution");

		System.out.println("maximum value thief will be able to carry : "+ KnapsackBF.knapSack(W, wt, val, N));
		System.out.println("This is running uding bruteforce solution");
		System.out.println("###########################################################################");

		System.out.println("This is DP solution");
		System.out.println("maximum value thief will be able to carry: " + KnapsackDP.knapSack(W, wt, val, N));
		System.out.println("Completed KnapsackDP");
		System.out.println("###########################################################################");
	}



}


/*	static int knapSackinput(int W, int wt[], int val[], int N){
		// TODO Auto-generated method stub\
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Total the no if item thief found?");
		 N = in.nextInt();
		System.out.println("Total no of items thief found  = " + N);

//			Scanner in1 = new Scanner(System.in1);
		System.out.println("Enter maximun weight thief can carry");
		 W = in.nextInt();
		System.out.println("maximun weight thief can carry  = " + W);


		System.out.println("Enter the Value of those items: ");
		for (int i = 0; i < N; i++) {
			val[i] = in.nextInt();
			System.out.println("Values: "+ val[i]);
	    System.out.println("Values of items Thief found  = " + val[i]);

		}


		System.out.println("Enter the weight of those items: ");
		for (int j = 0; j < N; j++) {
				wt[j] = in.nextInt();
				System.out.println("weight: "+ wt[j]);
		System.out.println("Weights of the  items  = " + wt[j]);
		}
	return knapSackinput(W, wt, val, N);

	}

	public static void main(int W, int wt[], int val[], int N) {
		System.out.println(KnapsackBF.knapSack(W, wt, val, N));
		System.out.println("maximum value that you will be able to carry");


		System.out.println(KnapsackDP.knapSack(W, wt, val, N));
		System.out.println("maximum value that you will be able to carry");

}

}
*/