package org.rehman.taka;

public class MergeH 
{
	static Comparable[] aux;
	
	static void sort(Comparable[] toBeCompared)
	{
		aux = new Comparable[toBeCompared.length];	
		sort(toBeCompared , 0 , toBeCompared.length - 1);
	}
	
	static void sort(Comparable[] toBeCompared , int low , int high)
	{
		int mid = low + ((high - low + 1)/2);
		
		// For Debugging Purpose
		// System.out.println("Start == " + low + "  Mid Level == " + mid + "  End == " + high);
		
		if(low == high) return;
		
		// System.out.println("Start == " + low + "  Mid Level == " + mid + "  End == " + high);
		
		sort(toBeCompared , low , mid - 1);
		sort(toBeCompared , mid , high);
		combine(toBeCompared , low, mid , high);
	}
	
	static void combine(Comparable[] toBeCompared , int start , int mid , int end)
	{
		
		// System.out.println("In Combine " + " Start = " + start + "  Mid = " + mid + "  End = " + end);
		
		int i = start , j = mid , z = start;
		while((i < mid) && (j <= end))
		{
			// System.out.println("Elemant Compared " + toBeCompared[i] + "  " + toBeCompared[j]);
			if(less(toBeCompared[i] , toBeCompared[j]))
			{
				aux[z++] = toBeCompared[i++];
			}
			else
			{
				aux[z++] = toBeCompared[j++];
			}
		}
		
		if(j == (end + 1))
		{
			while(i < mid)
			{
				aux[z++] = toBeCompared[i++];
			}
		}
		else
		{
			while(j <= end)
			{
				aux[z++] = toBeCompared[j++];
			}
		}
		
		i = start ;
		z = end;
		
		while(i <= z)
		{
			//System.out.print(aux[i++] + "  ");
			toBeCompared[i] = aux[i];
			i++;
		}
		
		// System.out.println();
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