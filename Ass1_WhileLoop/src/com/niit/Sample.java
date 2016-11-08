package com.niit;

public class Sample {
	public static void main(String[] args){
		
		int n=1,time=5;
		
		while(n<=time)
		{
			System.out.println("While loop: "+n);
			n++;
		}
		
		do{
			System.out.println("Do while loop: "+n);
			n++;
		}while(n<=time);
		
		for(n=1;n<=time;n++){
			System.out.println("For loop: "+n);
		}
		
	}

}
