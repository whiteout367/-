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
		
		int count; //배열 index 갯수
		int[] arrResult; //입력받은 배열 값
		int result; //최소 결과 값
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 배열의 갯수를 넣어주세요.");
		
		
		count = sc.nextInt();
		arrResult = new int[count];		
		
		
		System.out.println("처음 숫자를 넣어주세요.");
		for (int i = 0 ; i < count ; i++) {
			arrResult[i] = sc.nextInt();	
			if(i == count - 1)
				break;
			System.out.println("다음 숫자를 넣어주세요.");
		}
		
		result = ids(arrResult,count);
		System.out.println("최솟값은 "+result+"입니다.");
	}	
}
