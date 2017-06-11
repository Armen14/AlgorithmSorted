package com.algorithm;

public class GnomeSorted {
	void gnomeSort(int[] array) {
		int i = 1;
		ShowResult outputs = new ShowResult();
		
		while(i < array.length) {
			if(i == 0 || array[i - 1] <= array[i]) {
				i++;
			} else {
				int temp = array[i];
				array[i] = array[i - 1];
				array[i - 1] = temp;
				i--;
			}
		}
		outputs.displayResultInt(array);
		
	}
}
