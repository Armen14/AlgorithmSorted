package com.algorithm;

public class SelectionSorted {
	long sortSelect(long[] array) {
		ShowResult outputs = new ShowResult();
		
		for(int i = 0; i < array.length - 1; i++) {
			int min = i; //index minimal element
			
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[min])
					min = j;
			}
			
			//Swap the value
			if(i != array[i]){
				long temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}		
		}
		
		outputs.displayResultLong(array);
	
		return 0;
	}
}
