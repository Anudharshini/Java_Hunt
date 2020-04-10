package arrayConcept;

import java.util.Scanner;

public class InversionOfArray {

	public static void main(String[] args) {
		int n; int t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int k=0;k<t;k++){
		n=s.nextInt();int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n-1;j++){
				if(arr[i]<arr[j]){
					count++;
				}
			}
		}
		System.out.println(count);
		}
	}

}
