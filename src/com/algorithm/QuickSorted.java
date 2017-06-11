package com.algorithm;

public class QuickSorted {
	void quickSorted(int[] array, int first, int last) {
		ShowResult outputs = new ShowResult();

		int i = first;
		int j = last;
		int argument_zero = array[(first + last) / 2];
		try{
		do{
			while(array[i] < argument_zero) i++;
			while(array[j] > argument_zero) j--;//exception

			if(i <= j) {
				if(array[j] > array[i]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				i++;
				j--;
			}
		} while(i <= j);

		//recursion call function
		if(i < last) quickSorted(array, i, last);
		if(first < i) quickSorted(array, first, i);

		outputs.displayResultInt(array);
		}catch(Exception e){
			e.getMessage();
		}
	}
}
