package edu.unca.csci202;

public class SelectionSort {

	private boolean debug;
	private int comparisons;
	private int swaps;
	
	public SelectionSort() {
	this.debug = false;
	this.swaps = 0;
	this.comparisons = 0;
	}

	public SelectionSort(boolean debug_flag) {
	this.debug = debug_flag;
	this.swaps = 0;
	this.comparisons = 0;

	}


public void sort(int[] arr) {
	for (int i = 0; i < arr.length-1; i++){
	      int end = i;
	      for (int j = i+1; j < arr.length; j++)
	            if (arr[j] < arr[end]) {
	            	end = j;
	            }
	      int x = arr[i];
	      arr[i] = arr[end];
	      arr[end] = x;
	}
	if (debug == true) {
		for (int i = 0; i < arr.length-1; i++){
		      int end = i;
		      for (int j = i+1; j < arr.length; j++)
		            if (arr[j] < arr[end]) {
		            	end = j;
		            	this.swaps++;
		            }
		      int x = arr[i];
		      arr[i] = arr[end];
		      arr[end] = x;
		      this.comparisons++;
		} 
	}
	
	
	
}

public void sort(String[] arr) {
	for (int i = 0; i < arr.length-1; i++){
	      int end = i;
	      for (int j = i+1; j < arr.length; j++)
	            if (arr[j].compareTo(arr[end]) < 0) {
	            	end = j;
	            }
	      String x = arr[i];
	      arr[i] = arr[end];
	      arr[end] = x;
	}
	if (debug == true) {
		for (int i = 0; i < arr.length-1; i++){
		      int end = i;
		      for (int j = i+1; j < arr.length; j++)
		            if (arr[j].compareTo(arr[end]) < 0) {
		            	end = j;
		            	swaps++;
		            }
		      String x = arr[i];
		      arr[i] = arr[end];
		      arr[end] = x;
		      comparisons++;
		}
	}
	
	
}

public void printstats() {
	
	System.out.println("Comparisons: " + this.comparisons);
	System.out.println("Swaps: " + this.swaps);
}
}
