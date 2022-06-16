package edu.unca.csci202;

import java.util.Random;
import java.util.Scanner;

public class SortLab {

	public static void main(String[] args) {
		String test1 = "";
		String test2 = "";
		String test3 = "";
		int test4 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to run test? (Y/N)");
		test1 = scan.nextLine();
		if (test1.compareTo("Y") == 0) {
			System.out.println("What type do you want to run? (String/Int)");
			test2 = scan.nextLine();
			System.out.println("What type of algorithm do you want to run? (Bubble, Selection, Insertion)");
			test3 = scan.nextLine();
		}
		if (test2.compareTo("String") == 0) {
			if (test3.compareTo("Bubble") == 0){
				BubbleSort y = new BubbleSort(true);
				String [] x = testStrings();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			}
			if (test3.compareTo("Selection") == 0){
				SelectionSort y = new SelectionSort(true);
				String [] x = testStrings();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			}
			if (test3.compareTo("Insertion") == 0){
				InsertionSort y = new InsertionSort(true);
				String [] x = testStrings();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			}
			
		} else if (test2.compareTo("Int") == 0) {
			if (test3.compareTo("Bubble") == 0){
				BubbleSort y = new BubbleSort(true);
				int [] x = testNumbers();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
			
			}
			if (test3.compareTo("Selection") == 0){
				SelectionSort y = new SelectionSort(true);
				int [] x = testNumbers();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
			}
			if (test3.compareTo("Insertion") == 0){
				InsertionSort y = new InsertionSort(true);
				int [] x = testNumbers();
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
			}
			
		}else {
		System.out.println("Do you want to run speed? (Y/N)");
		test1 = scan.nextLine();
		if (test1.compareTo("Y") == 0) {
		System.out.println("What type do you want to run? (String/Int)");
		test2 = scan.nextLine();
		System.out.println("What type of algorithm do you want to run? (Bubble, Selection, Insertion");
		test3 = scan.nextLine();
		if (test2.compareTo("String") == 0) {
			System.out.println("How many things do you want sorted?");
			test4 = scan.nextInt(10);
			if (test3.compareTo("Bubble") == 0){
				BubbleSort y = new BubbleSort(true);
				String [] x = generateStrings(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			}
			if (test3.compareTo("Selection") == 0){
				SelectionSort y = new SelectionSort(true);
				String [] x = generateStrings(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
				
			}
			if (test3.compareTo("Insertion") == 0){
				InsertionSort y = new InsertionSort(true);
				String [] x = generateStrings(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			}
			
		} else if (test2.compareTo("Int") == 0) {
			System.out.println("How many strings?");
			test4 = scan.nextInt();
			if (test3.compareTo("Bubble") == 0);{
				BubbleSort y = new BubbleSort(true);
				int [] x = generateNumbers(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
				
			
			}
			if (test3.compareTo("Selection") == 0){
				SelectionSort y = new SelectionSort(true);
				int [] x = generateNumbers(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				}
				System.out.println();
				y.printstats();
				timeComparison();
			}
			if (test3.compareTo("Insertion") == 0){
				InsertionSort y = new InsertionSort(true);
				int [] x = generateNumbers(test4);
				y.sort(x);
				for(int i = 0; i < x.length; i++) {
					System.out.print(x[i] + ",");
				} 
				System.out.println();
				y.printstats();
				timeComparison();
			}
			}
		}
		
	}
	}
	
	public static void runtests() {
		
	}
	
	public static void timeComparison() {
		double y;
		long startTime = System.currentTimeMillis();
		for(int i = 0; i<100000000; i++) {
			y = Math.pow(i, 100);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time " + (endTime-startTime) + " milliseconds");
	}
	
	public static int[] testNumbers() {
		int arr[] = {1,6,4,7,8,5,6,4,2,2,2,1,3,5,6,4};
		
		return arr;
		
	}
	
	public static String[] testStrings() {
		String arr[] = {"the","quick", "brown", "fox", "jumps", "over", "this","is", "taking", "forever"};
		
		return arr;
		
	}
	
	public static int[] generateNumbers(int n) {
		Random ran = new Random();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = ran.nextInt();
		}
		return arr;
		
	}
	
	public static String[] generateStrings(int n) {
		Random ran = new Random();
		String arr[] = new String[n];
		for(int i = 0; i<n; i++) {
			int n_char = ran.nextInt(10) + 1;
			char[] my_str = new char[n_char];
			for (int j=0; j<n_char; j++) {
				my_str[j] = (char) (ran.nextInt(94) + 32);
				
			}
			arr[i] = new String(my_str.toString());
			
		}
		return arr;
		
	}

}


