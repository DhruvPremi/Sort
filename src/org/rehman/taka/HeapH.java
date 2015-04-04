package org.rehman.taka;


public class HeapH <key extends Comparable<key>>
{
	key[] heap;
	int N;
	
	HeapH(key[] toSort)
	{
		heap = toSort;
		N = heap.length;
	}
	
	public void buildMaxHeap()
	{		
		for(int i = N - 1 ; i >= 0 ; i--)
		{
			sink(i);
		}
	}
	
	
	public void sort()
	{
		buildMaxHeap();
		sortItOut();
	}
	
	public void sortItOut()
	{
		int j = N;
		
		while(j > 0)
		{
			delete();
			j--;
		}
	}
	
	
	public void delete()
	{
		if(N == -1) return;
		
		exchange(heap , 0 , --N);
		sink(0);
	}
	
	
	public void sink(int k)
	{
		while(((2*k) + 1) <= (N -1))
		{
			int j = (2*k) + 1;
			if((j < (N - 1)) && (less(heap[j] , heap[j + 1]))) 
			{
				// System.out.println("Changed to 2nd value K == " + k + "  j == " + j + "  " + pq[j].toString()  + "  " + pq[j + 1].toString() + "   " + less(pq[j] , pq[j + 1]));
				j++;
			}
			
			if(less(heap[j] , heap[k])) 
			{
				// System.out.println("It is Bigger");
				break;
			}
			exchange(heap , j , k);
			// System.out.println("Some exchange has taken place K == " + k + "  J == " + j);
			k = j;
			// System.out.println("Some exchange has taken place");
		
		}
	}
	
	public boolean less(Comparable a , Comparable b)
	{
		// This is where Poly morphisim does the Magic
		if(a.compareTo(b) == -1) return true;
		else return false;
	}
	
	public void exchange(Comparable[] array , int first ,int  second)
	{
		Comparable temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
}
