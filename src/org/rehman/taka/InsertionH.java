package org.rehman.taka;

public class InsertionH 
{
	static void sort(Comparable[] toBeCompared)
	{
		int length = toBeCompared.length;
		int min;
		
		for(int i = 0 ; i < length ; i++)
		{
			int j = i;
			
			while(j > 0)
			{
				if(less(toBeCompared[j] , toBeCompared[j - 1]))
				{
					exchange(toBeCompared , j , j - 1);
				}
				else
				{
					break;
				}
				j--;
			}
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
