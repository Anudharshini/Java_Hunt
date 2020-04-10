package arrayConcept;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		int m,n;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt();
		int a1[]=new int[m];
		int a2[]=new int[n];
		for(int i=0;i<m;i++){
			a1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			a2[i]=s.nextInt();
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a1[i]>a2[j]){
					int temp=a1[i];
					a1[i]=a2[j];
					a2[j]=temp;
				}
				//System.out.println(a1[i] +" "+a2[j]);
			}
		}
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println("\n");
		for(int i=0;i<m;i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println("\n");
		for(int i=0;i<n;i++){
			System.out.print(+a2[i]+" ");
		}
	}

}
