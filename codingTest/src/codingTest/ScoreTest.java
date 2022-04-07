package codingTest;

import java.util.Scanner;

public class ScoreTest {
	public static int result(String[] input) {
		
		int score = 0;
		int scoreIndex;
		
	
		for (String el : input) {
			
			 
			 String[] result = el.split(":");
	        
	        int[] intArray = new int[result.length];
	        
	        for (int i = 0; i < result.length; i++) {
	            
	            try {
	                intArray[i] = Integer.parseInt(result[i]);
	            } catch (Exception e) {
	                System.out.println("Unable to parse string to int: " + e.getMessage());
	            }
	        }
	        if(intArray[0] == intArray[1]) {
	        	score += 1;
	        }
	        else if(intArray[0] > intArray[1]) {
	        	score += 3;
	        }
	        else if(intArray[0] < intArray[1]) {
	        	score += 0;
	        }
	        
	       
		}
		 return score;
	}
	public static void main(String[] args) {
		
		int score = 0;
		int scoreIndex;
		String[] input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ ���� �־��ּ���.");
		
		
		scoreIndex = sc.nextInt();
		input = new String[scoreIndex];		
		
		
		System.out.println("?:?�������� ������ �־��ּ���.");
		for (int i = 0 ; i < scoreIndex ; i++) {
			input[i] = sc.next();	
			if(i == scoreIndex - 1)
				break;
			System.out.println("���� ������ �־��ּ���.");
		}
		
		
		score = result(input);
		System.out.println("��ü ������ " + score + "�Դϴ�.");
		}
	}

