package com.org;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int a[]= new int[5];
		Scanner scan=new Scanner(System.in);
        System.out.println("enter your value");
        for(int i=0;i<5;i++)
        {
        	a[i]=scan.nextInt();
        }
        System.out.println("output");
        for(int i=0;i<5;i++)
        {
        	System.out.println(a[i]);
        }
	}

}
