package org.kh.app;

import java.util.Scanner;

//조건문 if~elseif(~else~)
public class Condition3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scan=> 키보드 입력 받음, scan 후에 값을 입력하지 않으면 elseif 진행안됨
		System.out.print("점수 입력[0~100] :");
		int point = scan.nextInt();//double 이면 nextdouble
		char result;
		/* 학점(result)은 점수(point)가 90~100이면 'A', 80~89이면, 'b',
			70~79이면, 'C' 60~69이면 'D', 60이면 'F'
			if elseif 구문 사용하지 않고 if 구문을 여러개 사용해서 코딩하면 프로그램 느려짐, 여러번다 연산해야하니까
		*/
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
	}

}