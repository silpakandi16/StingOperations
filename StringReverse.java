package com.challenge.string;

import java.util.ArrayList;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		
		String str ="How are you?";
		
		System.out.print("Reversed String : ");
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));			
		}
		
		
		System.out.print("\nIs Palindrome : ");
		str="malayalam";
		int x=str.length()/2;
		int length = str.length()-1;
		int i=0;
		for(; i<x; i++) {
			if(str.charAt(i) != str.charAt(length)) {				
				break;
			}
			length--;
		}
		if(i == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		Car Car1 = new Car(1,"Audi", 999-999-9999, "Q10");
		Car Car2 = new Car(2, "BMW", 999-999-9999, "X5");
		Car Car3 = new Car(3, "Benz", 999-999-999, "SUV");
		Car Car4 = new Car(4, "CRV", 999-999-9999, "SUV");
		
		System.out.print("Car Details : \n");
		
		List<Car> Cars = new ArrayList<>(); 
		Cars.add(Car1);
		Cars.add(Car2);
		Cars.add(Car3);
		Cars.add(Car4);
		
		Cars.forEach(p->System.out.println("Id : " +p.getId() +" ,Name : " +p.getName()+" ,Number : " +p.getName()+" ,Address :" +p.getAddress()));
	}
}
