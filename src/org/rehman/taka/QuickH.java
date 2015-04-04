package org.rehman.taka;

public class QuickH 
{
	static void sort(Comparable[] toBeCompared)
	{
		// partition(toBeCompared , 0 , toBeCompared.length - 1);
		sort(toBeCompared , 0 , toBeCompared.length - 1);
		
	}
	
	static void show(Comparable[] toBeCompared)
	{
		for(int i = 0; i < toBeCompared.length ; i++)
		{
			System.out.print(toBeCompared[i].toString() + " ");
		}
		System.out.println();
	}
	
	static void sort(Comparable[] toBeCompared , int low , int high)
	{
		if(low == high) return;
		
		System.out.println("\n\n ****************************************************");
		show(toBeCompared);
		
		int k = partition(toBeCompared , low , high);
		
		System.out.println("Low == " + low + "  K == " + k + "  High == " + high);
		show(toBeCompared);
		
		
		if(k != low && k != high) 
		{
			sort(toBeCompared , low , k - 1);
			sort(toBeCompared, k + 1 , high);
		}
		
		else if(k == high) sort(toBeCompared, low , k -1);
		else if(k == low) sort(toBeCompared , k + 1 , high);
		
	}
	static int partition(Comparable[] toBeCompared , int low , int high)
	{
		if(low == high) return low;
		
		int pivot = low , i = low +1 , j = high;
		
		while((i <= j))
		{
			// System.out.println("Starting");
			while(less(toBeCompared[i] , toBeCompared[pivot]))
			{
				//System.out.println("In I");
				//System.out.println(i + "    " + high);
				if(i == high) 
				{
					//System.out.println("Going to break");
					break;
				}
				//System.out.println(i);
				i++;
			}
			while(less(toBeCompared[pivot] , toBeCompared[j]))
			{
				//System.out.println("In J");
				j--;
				if(j == low) 
				{
					break;
					
				}
			}
			// Extremely Critical Area
			if((j != low) && (i != high) && ( j > i)) 
			{
				//System.out.println("I == " + i + "   J == " + j);
				exchange( toBeCompared , i , j);
				i++;
				j--;
			}
			else
			{
				break;
			}
			
			//System.out.println("I == " + i + "   J == " + j);
		}
		
		exchange(toBeCompared , pivot , j);
		return j;
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
