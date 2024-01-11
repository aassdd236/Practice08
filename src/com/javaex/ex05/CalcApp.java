package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		String[] sArray;

		do{
			System.out.print(">> ");
			str=s.nextLine();
			sArray=str.split(" ");

			switch(sArray[1]) {
			case "+":
				Add add=new Add();
				add.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(add.calculate());
				break;
			case "-":
				Sub sub=new Sub();
				sub.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(sub.calculate());
				break;
			case "*":
				Mul mul=new Mul();
				mul.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(mul.calculate());
				break;
			case "/":
				Div div=new Div();
				div.setValue(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[2]));
				System.out.println(div.calculate());
				break;
			default:
				System.out.println("알 수 없는 연산자입니다.");
			}
		}while(str!="/q");
		System.out.println("종료합니다.");
	}
}
