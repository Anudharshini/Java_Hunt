package arrayConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTriplets {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			m.put(arr[i], i);
		}
		int count=0;
		for(int j=0;j<n-1;j++){
			for(int k=j+1;k<n;k++){
				if(m.containsKey(arr[j]+arr[k])){
					count++;
					System.out.println(arr[j]+" "+arr[k]+" "+(arr[j]+arr[k]));
				}
			}
		}
		if(count==0)
			System.out.println(-1);
		else
			System.out.println(count);
	}

}
