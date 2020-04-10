package arrayConcept;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(findEquiPoint(arr,n));
	}

	private static int findEquiPoint(int[] arr, int n) {
		int leftsum=0;
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		int rightsum=sum;
		for(int i=0;i<n;i++){
			rightsum=rightsum-arr[i];
			if(leftsum==rightsum){
				return i;
			}
			leftsum=leftsum+arr[i];
		}
		return -1;
	}

}
