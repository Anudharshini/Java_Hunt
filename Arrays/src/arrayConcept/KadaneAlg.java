package arrayConcept;

import java.util.Scanner;

public class KadaneAlg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		int maxSoFar=Integer.MIN_VALUE;
		int maxEnd=0,start=0,end=0; int ss=0;
		
		for(int i=0;i<size;i++){
			maxEnd=maxEnd+arr[i];
			if(maxSoFar<maxEnd){
				maxSoFar=maxEnd;
				start=ss;
				end=i;
			}
			if(maxEnd<0){
				maxEnd=0;
				ss=i+1;
			}
		}
		System.out.println(maxSoFar);
		System.out.println(start);
		System.out.println(end);
		for(int i=start;i<=end;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
