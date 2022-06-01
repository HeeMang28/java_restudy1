package day3;

class Calculator {
	static int result = 0;
    
    static int add(int num) {
   result += num;
   return result;
   }
    
public class Sample {
    public static void main(String[] args) {
    System.out.println(Calculator.add(3));
   System.out.println(Calculator.add(4));
	    }
	} // 계산기 에 3을 더하고 4를 더하는 구문

}
