package arrayConcept;

import java.util.Scanner;

public class NoOfPairs {

	public static void main(String[] args) {
		int m,n; boolean flag=false;
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		n=s.nextInt(); int count=0;
		int arr1[]=new int[m];
		int arr2[]=new int[n];
		for(int i=0;i<m;i++){
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			arr2[i]=s.nextInt();
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println(arr1[i]+" "+arr2[j]);
				flag=powerOf(arr1[i],arr2[j]);
				if(flag)
					count++;
			}
		}
		System.out.println("count of 'Number of pairs'"+count);
	}

	private static boolean powerOf(int i, int j) {
		int aa=1,bb=1;
		int t1,t2;
		t1=i;t2=j;
		while(t2!=0){
			aa=aa*i;
			--t2;
		}
		System.out.println("aa"+aa);
		t1=i;t2=j;
		while(t1!=0){
			bb=bb*j;
			--t1;
		}
		System.out.println("bb"+bb);
		if(aa>bb)
			return true;
		else
			return false;
	}	

}
