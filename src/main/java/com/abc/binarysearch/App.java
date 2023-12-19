package com.abc.binarysearch;
import java.lang.*;
import java.util.*;
class methods
{
	Scanner sc=new Scanner(System.in);
	public void readele(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1)+"th element :");
			arr[i]=sc.nextInt();
		}
	}
	public void printele(int arr[])
	{
		System.out.print("Elements in array :" );
		for(int i:arr)
		{
			System.out.print(i+"   ");
		}
		System.out.println();
	}
	public void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
		methods obj=new methods();
		System.out.print("Enter no of elements in array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		obj.readele(arr,n);
		obj.sort(arr);
		obj.printele(arr);
    }
}
