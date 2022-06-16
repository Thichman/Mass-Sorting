package edu.unca.csci202;

public class BubbleSort {

	private boolean debug;
	private int comparisons;
	private int swaps;
	
	public BubbleSort() {
		this.debug = false;
		this.swaps = 0;
		this.comparisons = 0;
	}
	
	public BubbleSort(boolean debug_flag) {
		this.debug = debug_flag;
		this.swaps = 0;
		this.comparisons = 0;
	
	}
	
	
	public void sort(int[] arr) {
		int s;
		if (debug == false) {
			for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length + 1; j++) {
					if (j == arr.length) {
						break;
					}
					if (arr[j] > arr[i]) {
						s = arr[i];
						arr[i] = arr[j];
						arr[j] = s;
					}
				}
			}
		}
		if (debug == true) {
			for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length + 1; j++) {
					if (j == arr.length) {
						break;
					}
					if (arr[j] >  arr[i]) {
						
						swaps++;
						s = arr[i];
						arr[i] = arr[j];
						arr[j] = s;
					}
					comparisons++;
				}
			}
		}		
		
	}
	
	public void sort(String[] arr) {
		String s;
		if (debug == false) {
			for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length + 1; j++) {
					if (j == arr.length) {
						break;
					}
					if (j == arr.length) {
						break;
					}
					if (arr[j].compareTo(arr[i]) > 0  ) {
						s = arr[i];
						arr[i] = arr[j];
						arr[j] = s;
					}
				}
			}
		}
		if (debug == true) {
			for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length + 1; j++) {
					if (j == arr.length) {
						break;
					}
					if (j == arr.length) {
						break;
					}
					if (arr[j].compareTo(arr[i]) > 0  ) {
						s = arr[i];
						arr[i] = arr[j];
						arr[j] = s;
					}
				}
					comparisons++;
				}
			}
		}		
		
		
	
	public void printstats() {
		
		System.out.println("Comparisons: " + this.comparisons);
		System.out.println("Swaps: " + this.swaps);
	}
}

