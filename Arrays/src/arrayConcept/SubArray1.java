package arrayConcept;

import java.util.Scanner;

public class SubArray1 {

	public static void main(String[] args) {
		int a,sum; int start,end;
		boolean found=false;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		sum=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=s.nextInt();
		}
		
		for(int j=0;j<a;j++){
			int temp=0;
			if(arr[j]>sum){
				continue;
			}
			for(int k=j;k<a;k++){
			temp=temp+arr[k];
			if(temp==sum){
				end=k;
				found=true;
				System.out.println(j+1 +" "+ (k+1));
				break;
			}else if(temp>sum){
				break;
			}
			}
			if(found){
				break;
			}
		}
		

	}

}
