package day3;

public class sample5 {

	public static void main(String[] args) {
        Calculator cal1 = new Calculator();  // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator();  // 계산기2 객체를 생성한다.

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
        //객체를 사용하면 계산기 대수가 늘어나더라도 
        //객체를 생성만 하면 되기 때문에 클래스만을 사용하는 경우와 달리 매우 간단해진다.
    }

}
