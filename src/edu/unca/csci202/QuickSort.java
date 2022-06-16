package edu.unca.csci202;

public class QuickSort {

	private boolean debug;
	private int comparisons;
	private int swaps;
	
	public QuickSort() {
		this.debug = false;
		this.swaps = 0;
		this.comparisons = 0;
		}

	 public QuickSort(boolean debug_flag) {
		this.debug = debug_flag;
		this.swaps = 0;
		this.comparisons = 0;

	}
	 
	 void sort(int array2[], int min, int max){ 
	        if (min < max) 
	        { 
	            
	            int pivote2 = partition(array2, min, max); 
	  
	           
	            sort(array2, min, pivote2-1); 
	            sort(array2, pivote2+1, max); 
	        } 
	    }
	 
	 
	int partition(int array[], int min, int max){ 
        int pivot = array[max];  
        int left = (min-1); 
        for (int j = min; j<max; j++) 
        { 
            
            if (array[j] < pivot) 
            { 
                left++; 
  
                
                int temp = array[left]; 
                array[left] = array[j]; 
                array[j] = temp; 
            }
        }
 
        int temp = array[left+1]; 
        array[left+1] = array[max]; 
        array[max] = temp; 
  
        return left+1; 
    } 
  
}
