package codingTest;

import java.util.Scanner;

public class QuarterTest {
	static String quaterResult = "";
	 

	public static String quarterDiscriminate(int insertMonth) { //�б� äũ
		switch(insertMonth) {
		case 1: case 2: case 3:
			quaterResult = "1�б�";
			break;
		case 4: case 5: case 6:
			quaterResult = "2�б�";
			break;
		case 7: case 8: case 9:
			quaterResult = "3�б�";
			break;
		case 10: case 11: case 12:
			quaterResult = "4�б�";
			break;
		default :
		}
		return quaterResult;
	}
	
	
	public static void main(String[] args) {
		
		int month = 0;
		
		String result;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		
		month = sc.nextInt();
		
		if(month>12) { //�Է°��� 12�� ���� ���
			System.out.println("���� ����� �Է��ϼ���");
			month = sc.nextInt();
		}
		
		
		result = quarterDiscriminate(month); 
		
		System.out.println("�̹����� "+result+"�Դϴ�.");
		
	}
	
	
}
