package edu.unca.csci202;


public class InsertionSort {

	private boolean debug;
	private int comparisons;
	private int swaps;
	
	public InsertionSort() {
	this.debug = false;
	this.swaps = 0;
	this.comparisons = 0;
	}

 public InsertionSort(boolean debug_flag) {
	this.debug = debug_flag;
	this.swaps = 0;
	this.comparisons = 0;

}


public void sort(int[] arr) {
	if(debug == false) {  
        for (int i = 1; i < arr.length; i++) {  
            int end = arr[i];  
            int j = i-1;  
            while ((j > -1) && ( arr[j] > end ) ) {  
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = end;  
        }
		
	
	}
	if(debug == true) {
		int index;
		for (int i = 1; i < arr.length; i++) {  
            int end = arr[i];  
            int j = i-1;  
            while ((j > -1) && ( arr[j] > end ) ) {  
                arr [j+1] = arr [j];  
                j--;  
                this.swaps++;
            }
            arr[j+1] = end;  
            comparisons++;
        }
	}
	
	
}

public void sort(String[] arr) {
		if(debug == false) {  
	        for (int i = 1; i < arr.length; i++) {  
	            String end = arr[i];  
	            int j = i-1;  
	            while ((j > -1) && (arr[j].compareTo(end) > 0 ) ) {  
	                arr [j+1] = arr [j];  
	                j--;  
	            }  
	            arr[j+1] = end;  
	        }
			
		
		}
		if(debug == true) {
			int index;
			for (int i = 1; i < arr.length; i++) {  
	            String end = arr[i];  
	            int j = i-1;  
	            while ((j > -1) && (arr[j].compareTo(end) > 0 ) ) {  
	                arr [j+1] = arr [j];  
	                j--;  
	                this.comparisons++;
	            }  
	            arr[j+1] = end;  
	            this.swaps++;
	        }
		}
	
	
}

public void printstats() {
	
	System.out.println("Comparisons: " + this.comparisons);
	System.out.println("Swaps: " + this.swaps);
}
}
