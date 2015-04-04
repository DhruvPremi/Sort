package org.rehman.taka;

public class SelectionH 
{
	static void sort(Comparable[] toBeCompared)
	{
		int length = toBeCompared.length;
		int min;
		
		for(int i = 0 ; i < length ; i++)
		{
			min = i;
			for(int j = i ; j < length; j++)
			{
				if(less(toBeCompared[j] , toBeCompared[min]))
				{
					min = j;
				}
			}
			exchange(toBeCompared , i , min);
		}
	}
	
	static boolean less(Comparable a , Comparable b)
	{
		// This is where Poly morphisim does the Magic
		if(a.compareTo(b) == -1) return true;
		else return false;
	}
	static void exchange(Comparable[] array , int first ,int  second)
	{
		Comparable temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
}
