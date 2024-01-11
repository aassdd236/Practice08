package com.javaex.ex08;

import java.util.Scanner;

public class Friend {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String[] friends1=new String[3];
		String[] friends2=new String[3];
		String[] friends3=new String[3];
		
		System.out.println("친구 3명을 등록해 주세요");
		friends1=s.nextLine().split(" ");
		friends2=s.nextLine().split(" ");
		friends3=s.nextLine().split(" ");
		
		System.out.println("이름:"+friends1[0]+" 핸드폰:"+friends1[1]+" 학교:"+friends1[2]);
		System.out.println("이름:"+friends2[0]+" 핸드폰:"+friends2[1]+" 학교:"+friends2[2]);
		System.out.println("이름:"+friends3[0]+" 핸드폰:"+friends3[1]+" 학교:"+friends3[2]);
		
		s.close();

	}

}
