package com.jsp.arrayslogicalproblems;

public class ArraysPrimeNumbers {
	public static void main(String[] args) {
		
                   int primecount=0;
		int a[]= {3,4,5,8,9,7,11,13,14,15,29};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
				}
			
			if (count==2) {
				primecount ++;
			
			}
			
		}
		System.out.println(primecount);
		
	}
	
	

}
