package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //주소 확인 false
		System.out.println(p2 == p3); //주소 확인 false
		System.out.println(p3 == p4); //주소 확인 false
		System.out.println(p4 == p1); //주소 확인	true	
		System.out.println(p1.equals(p2)); //논리값 비교 true >> equals 메소드가 없어서 값을 제대로 비교하지 않음
		System.out.println(p4.equals(p1)); //논리값 비교 true
		
		//실행되는 이유: Object 클래스가 기본으로 equals를 가지고 있음
		//하지만 값 비교는 x
	}

}


