package arrayConcept;

import java.util.Arrays;
import java.util.Scanner;

public class RearrageArray {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i = 0, j = (arr.length-1);

	    while(i < j) {
	      System.out.print(arr[j] + " ");
	      System.out.print(arr[i] + " ");
	      j--;i++;
	    }

	    if(arr.length % 2 != 0) {
	      System.out.print(arr[i]);
	    }
		

	}

}
