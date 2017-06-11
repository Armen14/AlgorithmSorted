package com.algorithm;

public class ShellSorted {
	int sortShell(int[] array) {
		int step;
		int j,temp;
		
		ShowResult outputs = new ShowResult();
		
		for(step = array.length/2; step > 0; step = step / 2){
			for(int i = step; i < array.length; i++){
				temp = array[i];
				for(j = i; j >= step; j -= step){
					if(temp < array[j - step])
						array[j] = array[j - step];
					else
						break;
				}
				array[j] = temp;
			}
		}
		outputs.displayResultInt(array);
		
		return 0;
	}
}
