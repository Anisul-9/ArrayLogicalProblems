package com.jsp.arrayslogicalproblems;
public class SumOddeven {
 
	public int itIsOddEvenSum( int arr[]) {
		 
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				evensum=evensum+arr[i];
			}
			else {
				oddsum=oddsum+arr[i];
			}
		}
		
		
		return [ evensum +":"+oddsum];
		
		
	
	}
	
	public static void main(String[] args) {
		
		int a[]= {10,2,3,5,7,9,6,8};
		
		SumOddeven sm=new SumOddeven();
		sm.itIsOddEvenSum(a);
		
		 
	}
}
