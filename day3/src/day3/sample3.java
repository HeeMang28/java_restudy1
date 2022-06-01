package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class sample3 {

	public static void main(String[] args) {
		// String[] numbers = {"one", "two", "three"};
		//for(int i=0; i<numbers.length; i++) {
		//	System.out.println(numbers[i]);
		//} 기존에 있던 for문이다.
		
		//String[] numbers = {"one", "two", "three"};
		//for(String number : numbers) {
		//	System.out.println(number);
		//} 위 구문을 for each 문으로 바꾼것.
		
		//for (type var: iterate) {
		//	body-of-loop
		// }
		// 위에서 iterate는 루프를 돌릴 객체이고 
		// iterate 객체에서 한개씩 순차적으로 var에 대입되어 for문이 수행된다. 
		// iterate로 사용할 수 있는 자료형은 루프를 돌릴수 있는 자료형(배열 및 ArrayList 등)만 가능하다.
    	ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
    	for (String number : numbers) {
        	System.out.println(number);
            }
       }
	}

