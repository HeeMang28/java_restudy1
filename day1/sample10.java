
public class sample10 {

	public static void main(String[] args) {
		// 문자열 포매팅
		// 문자열에서 또 하나 알아야 할 것으로는 문자열 포매팅(Formatting)이 있다. 이것을
		// 공부하기 전에 다음과 같은 문자열을 출력하는 프로그램을 작성했다고 가정해보자.
		// "현재 온도는 18도입니다."
		// 시간이 지나서 20도가 되면 다음 문장을 출력한다.
		// "현재 온도는 20도입니다."
		// 위 두 문자열은 모두 같은데 20이라는 숫자와 18이라는 숫자만 다르다. 이렇게 문자열 안의 특정한 값을 바꿔야 할 경우가 있을 때
		// 이것을 가능하게 해주는 것이 바로 문자열 포매팅 기법이다.
		// 쉽게 말해 문자열 포매팅이란 문자열 안에 어떤 값을 삽입하는 방법이다. 다음 예를 직접 실행해 보면서 그 사용버을 알아보자.
		
		// 문자열 포매팅 따라 하기
		// 1. 숫자 바로 대입
		System.out.println(String.format("I eat %d apples.", 3)); // "I eat 3 appels."출력
		// 문자열 포매팅은 String.format 메소드를 사용한다. 위 예제의 결과값을 보면 알겠지만 위 예제는 문자열 안에 정수 3을 삽입하는 방법을 보여 준다. 문자열 안에서
		// 숫자를 넣고 싶은 자리에 %d 문자를 넣어 주고, 삽입할 숫자 3은 두번째 파라미터로 전달했다. 여기에서 %d는 문자열 포맷 코드라고 부른다
		
		// 2. 문자열 바로 대입
		// 문자열 안에 꼭 숫자만 넣으라는 법은 없다. 이번에는 숫자 대신 문자열을 넣어보자.
		System.out.println(String.format("I eat %s apples.", "five")); // "I eat five apples." 출력
		// 위 예제에서는 문자열 안에 또 다른 문자열을 삽입하기 위해 앞에서 사용한 문자열 포맷 코드 %d가 아닌 %s를 썻다. 어쩌면 눈치 빠른 독자는 벌써 유추하였을 것이다.
		// 숫자를 넣기위해서는 %d를 써야 하고, 문자열을 넣기 위해서는 %s를 써야한다는 사실을 말이다.
		
		// 3. 숫자 값을 나타내는 변수로 대입
		int number = 3;
		System.out.println(String.format("i eat %d apples.", number)); // "I eat 3 appels."출력
		// 1번처럼 숫자를 바로 대입하나 위 예제처럼 숫자 값을 나타내는 변수를 대입하나 결과는 같다.
		
		// 4. 2개 이상의 값 넣기
		// 그렇다면 문자열 안에 1개가 아닌 여러 개의 값을 넣고 싶을 땐 어떻게 해야 할까?
		int number1 = 10;
		String day = "three";
		
		// "I ate 10 apples. so I was sick for three days." 출력
		System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number1, day));
		// 위 예문처럼 2개 이상의 값을 넣으려면 파라미터로 여러개를 전달하면 된다.
		

	}

}
