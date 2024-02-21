package org.kh.app;

public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//scan=> 키보드 입력 받음, scan 후에 값을 입력하지 않으면 elseif 진행안됨
		System.out.print("점수 입력[0~100] :");
		int point = scan.nextInt();//double 이면 nextdouble
		String result;
		/* 학점(result)은 점수(point)가 
		   99~100이면 'A++', 93~96이면 'A0', 90~92이면 'A-',
		   87~89이면, 'B++', 83~86이면 'B0', 80~82이면 'B-',
		   77~79이면, 'C++', 73~76이면 'C0', 70~72이면 'C-',
		   67~69이면 'D++',  63~66이면 'D0', 60~62이면 'D-',
		   60이면 'F', 
		   =>다단계 if의 if/elseif/else 문 활용
		   시상내용은 학점이 A++이면 '학업우수상', A0이면 '노력상', A-이면 '아차상'으로 하고, 
		   나머지는 ''으로 하되, 
		   =>switch~case~문 활용
		*/			
		
		if (point >= 90) {
			if(point >= 97) {
				result = "A++";
			}
			else if(point >= 93) {
				result = "A0";
			}
			else {
				result = "A-";
			}
		}		
		else if (point >= 80) {
			if(point >= 87) {
				result = "B++";
			}
			else if(point >= 83) {
				result = "B0";
			}
			else {
				result = "B-";
			}
		}
		else if (point >= 70) {
			if(point >= 77) {
				result = "C++";
			}
			else if(point >= 73) {
				result = "C0";
			}
			else {
				result = "C-";
			}
		}
		else if (point >= 60) {
			if(point >= 67) {
				result = "D++";
			}
			else if(point >= 63) {
				result = "D0";
			}
			else {
				result = "D-";
			}
		}
		else {
			result = "F";
		}
		
		System.out.printf("\n당신의 점수는 %d점, 학점은 %s 입니다.", point, result);	
		