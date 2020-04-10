package arrayConcept;

import java.util.Scanner;

public class PlatformsRequired {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			dep[i]=s.nextInt();
		}
		System.out.println("min no of platforms required"+findMinPlatform(arr,dep,n));

	}

	private static int findMinPlatform(int[] arr, int[] dep, int n) {
		int platformNeeded=1,temp=1;
		int i=1,j=0;
		while(i<n&&j<n){
			if(arr[i]<=dep[j]){
				platformNeeded++;
				i++;
				if(platformNeeded>temp){
					temp=platformNeeded;
				}
			}
			else
			{
				platformNeeded--;
				j++;
			}
		}
	return temp;	
	}

}
