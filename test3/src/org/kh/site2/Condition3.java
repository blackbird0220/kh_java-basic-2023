package org.kh.site2;

import java.util.Scanner;

//조건문 if=elseif(~else~)
public class Condition3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scan=>키보드 입력 받음
		System.out.print("점수 입력[0~100] :");
		int point = scan.nextInt();//double 이면 nextdouble
		System.out.printf("\n당신의 점수는 %d점 입니다.", point);
	}

}
