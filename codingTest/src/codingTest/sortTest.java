package codingTest;


import java.util.Arrays;
import java.util.Scanner;

public class sortTest {
	
	
	public static int ids(int[] result, int count) {
		int after = 0;
		int before = 0;
		int min;
		
		Arrays.sort(result);
		
		for (int j = 1 ; j < count ; j++) {
			before = result[j-1];
			after = result[j];
			
			if((after - before)>1) {
				min = before + 1;
				return min;
			}	
		}
		min = result[count-1] + 1;
		return min;
	}
	

	public static void main(String[] args) {
		
		int count; //�迭 index ����
		int[] arrResult; //�Է¹��� �迭 ��
		int result; //�ּ� ��� ��
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �迭�� ������ �־��ּ���.");
		
		
		count = sc.nextInt();
		arrResult = new int[count];		
		
		
		System.out.println("ó�� ���ڸ� �־��ּ���.");
		for (int i = 0 ; i < count ; i++) {
			arrResult[i] = sc.nextInt();	
			if(i == count - 1)
				break;
			System.out.println("���� ���ڸ� �־��ּ���.");
		}
		
		result = ids(arrResult,count);
		System.out.println("�ּڰ��� "+result+"�Դϴ�.");
	}	
}
