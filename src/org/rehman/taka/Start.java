package org.rehman.taka;


public class Start 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int num = 15;
		Comparable [] comp = new Comparable[num];
		
		for(int i = 0 ; i < num ; i++)
		{
			comp[i] = new Integer(num - i);			
		}
		
		comp[0] = 8;
		// comp[1] = -1;
		
		/*
		// 3 1 2 7 6 5 4
		comp[0] = 3;
		comp[1] = 1;
		comp[2] = 2;
		comp[3] = 7;
		comp[4] = 6;
		comp[5] = 5;
		comp[6] = 4;
		*/

		
		// Inserting Some redundent Stuff
		/*
		comp[2] = 8;
		comp[3] = 8;
		comp[4] = 8;
		*/
		
		for(Comparable a : comp)
		{
			System.out.print(a.toString() + "  ");
		}
		
		System.out.println("\n After Sorting");
			
		// 1. Selection Sort
		// SelectionH.sort(comp);
		
		// 2. Insertion Sort
		// InsertionH.sort(comp);
		
		// 3. Merge Sort
		// MergeH.sort(comp);
		
		// 4. Quick Sort
		// QuickH.sort(comp);
		
		// 5. Priorty Queue
		/*
		PQueue<Integer> pq = new PQueue<Integer>(10);
		
		pq.insert(new Integer(1));
		pq.insert(new Integer(-1));
		pq.insert(new Integer(10));
		pq.insert(new Integer(20));
		pq.insert(new Integer(25));
		pq.insert(new Integer(20));
		pq.insert(new Integer(200));
		pq.insert(new Integer(-200));
		pq.insert(new Integer(20000));

		pq.show();
		pq.delete();
		pq.show();
		pq.delete();
		pq.show();
		pq.delete();
		pq.show();
		*/
		
		// 6. Heap Sort
		HeapH<Integer> heap = new HeapH(comp);
		heap.sort();
		
		for(Comparable a : comp)
		{
			System.out.print(a.toString() + "  ");
		}
	}
}
