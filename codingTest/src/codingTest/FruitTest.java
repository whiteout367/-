package codingTest;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class FruitTest {
	public static String[] result(int input) {
		
		int part = 0; //각 자리수
		String[] arr = new String[15];
		int i = 0;
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();//초기값 지정
		map.put(1,"kiwi         ");
		map.put(2,"pear         ");
		map.put(3,"kiwi         ");
		map.put(4,"banana       ");
		map.put(5,"melon        ");
		map.put(6,"banana       ");
		map.put(7,"melon        ");
		map.put(8,"pineapple    ");
		map.put(9,"apple        ");
		map.put(10,"pineapple   ");
		map.put(11,"cucumber    ");
		map.put(12,"pineapple   ");
		map.put(13,"cucumber    ");
		map.put(14,"orange      ");
		map.put(15,"grape       ");
		map.put(16,"orange      ");
		map.put(17,"grape       ");
		map.put(18,"apple       ");
		map.put(19,"grape       ");
		map.put(20,"cherry      ");
		map.put(21,"pear        ");
		map.put(22,"cherry      ");
		map.put(23,"pear        ");
		map.put(24,"kiwi        ");
		map.put(25,"banana      ");
		map.put(26,"kiwi        ");
		map.put(27,"apple       ");
		map.put(28,"melon       ");
		map.put(29,"banana      ");
		map.put(30,"melon       ");
		map.put(31,"pineapple   ");
		map.put(32,"melon       ");
		map.put(33,"pineapple   ");
		map.put(34,"cucumber    ");
		map.put(35,"orange      ");
		map.put(36,"apple       ");
		map.put(37,"orange      ");
		map.put(38,"grape       ");
		map.put(39,"orange      ");
		map.put(40,"grape       ");
		map.put(41,"cherry      ");
		map.put(42,"pear        ");
		map.put(43,"cherry      ");
		map.put(44,"pear        ");
		map.put(45,"apple       ");
		map.put(46,"pear        ");
		map.put(47,"kiwi        ");
		map.put(48,"banana      ");
		map.put(49,"kiwi        ");
		map.put(50,"banana      ");
		map.put(51,"melon       ");
		map.put(52,"pineapple   ");
		map.put(53,"melon       ");
		map.put(54,"apple       ");
		map.put(55,"cucumber    ");
		map.put(56,"pineapple   ");
		map.put(57,"cucumber    ");
		map.put(58,"orange      ");
		map.put(59,"cucumber    ");
		map.put(60,"orange      ");
		map.put(61,"grape       ");
		map.put(62,"cherry      ");
		map.put(63,"apple       ");
		map.put(64,"cherry      ");
		map.put(65,"pear        ");
		map.put(66,"cherry      ");
		map.put(67,"pear        ");
		map.put(68,"kiwi        ");
		map.put(69,"pear        ");
		map.put(70,"kiwi        ");
		map.put(71,"banana      ");
		map.put(72,"apple       ");
		map.put(73,"banana      ");
		map.put(74,"melon       ");
		map.put(75,"pineapple   ");
		map.put(76,"melon       ");
		map.put(77,"pineapple   ");
		map.put(78,"cucumber    ");
		map.put(79,"pineapple   ");
		map.put(80,"cucumber    ");
		map.put(81,"apple       ");
		map.put(82,"grape       ");
		map.put(83,"orange      ");
		map.put(84,"grape       ");
		map.put(85,"cherry      ");
		map.put(86,"grape       ");
		map.put(87,"cherry      ");
		map.put(88,"pear        ");
		map.put(89,"cherry      ");
		map.put(90,"apple       ");
		map.put(91,"kiwi        ");
		map.put(92,"banana      ");
		map.put(93,"kiwi        ");
		map.put(94,"banana      ");
		map.put(95,"melon       ");
		map.put(96,"banana      ");
		map.put(97,"melon       ");
		map.put(98,"pineapple   ");
		map.put(99,"apple       ");
		map.put(100,"pineapple  ");
		
		while(true) {
			part = input/10000 + input/1000 + input/100 + input/10 + input%10;
			input = input - part;
			if(map.containsKey(input)) {
				arr[i] = map.get(input);
				i++;
				//System.out.println(input);
				}
			
			if(input<10) {
				break;
			}
			
		}
		arr[i] = map.get(input);
		
		return arr;
	}
	public static void main(String[] args) {
		
		int input; //입력값
		String[] arr;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		
		
		input = sc.nextInt();
		
		arr = result(input);
		
		//System.out.println(map.get(53));
		
		for (String el : arr) {
		    System.out.println(el);
		}
		
		
		
	}
}
