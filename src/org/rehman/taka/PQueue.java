package org.rehman.taka;

public class PQueue <key extends Comparable<key>> 
{
	key[] pq;
	int N;
	
	PQueue(int capacity)
	{
		pq = (key[]) new Comparable[capacity + 1];
	}
	
	public void swim(int k)
	{
		while(k > 1 && ( less(pq[k/2] , pq[k])))
		{
			exchange(pq , k/2 , k);
			k = k/2;
		}
	}
	
	public void sink(int k)
	{
		while(2*k <= N)
		{
			int j = 2*k;
			if((j < N) && (less(pq[j] , pq[j + 1]))) 
			{
				// System.out.println("Changed to 2nd value K == " + k + "  j == " + j + "  " + pq[j].toString()  + "  " + pq[j + 1].toString() + "   " + less(pq[j] , pq[j + 1]));
				j++;
			}
			
			if(less(pq[j] , pq[k])) 
			{
				// System.out.println("It is Bigger");
				break;
			}
			exchange(pq , j , k);
			// System.out.println("Some exchange has taken place K == " + k + "  J == " + j);
			k = j;
			// System.out.println("Some exchange has taken place");
		
		}
	}
	
	
	public void insert(key k)
	{
		pq[++N] = k;
		swim(N);
	}
	
	public void delete()
	{
		if(N == 0) return;
		
		exchange(pq , 1 , N--);
		sink(1);
	}
	
	public void show()
	{
		int j = 1;
		
		while(j <= N)
		{
			System.out.print(pq[j].toString() + " ");
			j++;
		}
		
		System.out.println();
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
