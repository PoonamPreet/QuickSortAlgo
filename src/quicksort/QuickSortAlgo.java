package quicksort;

public class QuickSortAlgo //divide and conquer method
{
	static int partition(int[]a1,int first,int last)
	{
		int pivot=a1[last];
		int i=first-1;
		for(int j=first;j<last;j++)
		{
			if(a1[j]<=pivot)
			{
				i++;
				int swap=a1[i];
				a1[i]=a1[j];
				a1[j]=swap;
			}
		}
		int swap =a1[i+1];
		a1[i+1]=a1[last];
		a1[last]=swap;
		
		return i+1;
	}
	
	static void Quicksort(int[] a1,int first,int last) 
	{
		if(first<last) {
		int mid=partition(a1, first, last);
		Quicksort(a1,first,mid-1);
		Quicksort(a1,mid+1,last);
		}
	}
	public static void main(String[] args) 
	{
	int[] a1=new int[] {5,9,7,1,3,2,4};
	Quicksort(a1, 0, a1.length-1);
	
	for(int i=0;i<a1.length;i++)
	{
		System.out.print(a1[i]+" ");
	}
	
	
	
	}
}
