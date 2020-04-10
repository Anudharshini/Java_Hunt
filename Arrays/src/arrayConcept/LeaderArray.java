package arrayConcept;

import java.util.Scanner;

public class LeaderArray {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		printleader(arr,n);
	}

	private static void printleader(int[] arr, int n) {
		int compare=0;
		System.out.print(arr[n-1]+" ");
		compare=arr[n-1];
		for(int i=n-2;i>0;i--){
			
			if(arr[i]>compare){
				compare=arr[i];
				System.out.print(arr[i] +" ");
				
			}
		}
		
	}

}
