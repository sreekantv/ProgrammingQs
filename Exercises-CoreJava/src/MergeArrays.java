
import java.util.*;
import java.lang.*;
import java.io.*;

class MergeArrays {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		//test
	
		int t=sc.nextInt();
				System.out.println(sc.next());
		while(t>0){
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] arr1=new int[n1];
		int[] arr2=new int[n2];
		
		int[] res=new int[n1+n2];
		for(int i=0;i<n1;i++){
		    arr1[i]=sc.nextInt();
		    //System.out.print(arr1[i]+" ");
		}
		for(int i=0;i<n2;i++){
		    arr2[i]=sc.nextInt();
		    //System.out.print(arr2[i]+" ");
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int j=0;
		int k=0;
		int l=0;
		while (j<n1 && k <n2)
    {
        
        if (arr1[j] < arr2[k])
            res[l++] = arr1[j++];
        else
            res[l++] = arr2[k++];
    }
 
    
    while (j < n1)
        res[l++] = arr1[j++];
 
    
    while (k < n2)
        res[l++] = arr2[k++];
		
		for(int i=0;i<(n1+n2);i++)
		System.out.print(res[i]+" ");
		System.out.println();
		t--;
	}
}
}