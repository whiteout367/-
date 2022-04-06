package codingTest;

import java.util.Scanner;

public class QuarterTest {
	static String quaterResult = "";
	 

	public static String quarterDiscriminate(int insertMonth) { //분기 채크
		switch(insertMonth) {
		case 1: case 2: case 3:
			quaterResult = "1분기";
			break;
		case 4: case 5: case 6:
			quaterResult = "2분기";
			break;
		case 7: case 8: case 9:
			quaterResult = "3분기";
			break;
		case 10: case 11: case 12:
			quaterResult = "4분기";
			break;
		default :
		}
		return quaterResult;
	}
	
	
	public static void main(String[] args) {
		
		int month = 0;
		
		String result;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		
		month = sc.nextInt();
		
		if(month>12) { //입력값이 12를 넘을 경우
			System.out.println("달을 제대로 입력하세요");
			month = sc.nextInt();
		}
		
		
		result = quarterDiscriminate(month); 
		
		System.out.println("이번달은 "+result+"입니다.");
		
	}
	
	
}
