package com.jsp.arrayslogicalproblems;

public class BubbleSort{
	
	public void isBubbleSort(  int a[]){
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
				}
			}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		}
	public static void main(String[] args) {
		int s[]= {71,18,7,74,63,48,23};
		BubbleSort b=new BubbleSort();
		b.isBubbleSort(s);
		
		
	}
		
	}


