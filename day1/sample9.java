
public class sample9 {

	public static void main(String[] args) {
		// 문자열 내장 메소드
		// String 자료형의 내장 메소드 중에서 자주 사용되는 것들에 대해서 알아보자.
		// equals
		// equals는 두개의 문자열이 동일한지를 비교하여 결과값을 리턴한다.
		// 다음의 예를 보자.
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equlas(b)); // false 출력
		System.out.println(a.equlas(c)); // true 출력
		// 문자열 a 와 문자열 b 는 "hello"와 "java"로 서로 같지 않다. 따라서 equals 메소드 호출 시 false를 리턴한다.
		// 문자열 a와 문자열 c 는 "hello"와 "hello"로 서로 같다. 따라서 true를 리턴한다.
		
		// 문자열의 값을 비교할때는 반드시 equals를 사용해야 한다. == 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.
		// String a = "hello";
		// String b = new String("hello");
		//System.out.println(a.equlas(b)); // true
		//System.out.println(a == b); // false
		// 문자열 a와 b는 모두 "hello"로 같은 값이지만 equals를 호출했을 때는 true 를
		// == 연산자를 이용했을 때는 false를 리턴한다. a와 b는 값은 같지만 서로 다른 객체이다.
		// ==은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false를 리턴한다.
		
		// indexOf
		// indexOf는 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴한다.
		// 다음과 같은 문자열을 보자.
		// String a = "Hello Java";
		// 위와 같은 a 문자열에서 "Java"라는 문자열이 시작되는 위치를 알고 싶은 경우
		// indexOf를 다음과 같이 사용할 수 있다.
		String a = "Hello Java";
		System.out.println(a.indexOf("Java")); 
		// "Hello Java"라는 문자열에서 "Java"라는 문자열은 일곱번째("J")부터 시작이다.
		// 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문이다.
		
		// contains
		// contains는 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴한다.
		String a = "Hello Java";
		System.out.println(a.contains("Java"));
		// 문자열 a는 "Java"라는 문자열을 포함하고 있기 때문에 true를 리턴한다.
		
		// charAt
		// charAt은 문자열에서 특정 위치의 문자(char)를 리턴한다.
		// 다음과 같은 문자열을 보자.
		String a = "Hello Java";
		// 위와 같은 a 문자열에서 "J"라는 문자는 6번째 인덱스에 위치한 문자이다. 6이라는 숫자로 "J"라는 문자를 얻기 위해서는 다음과 같이 charAt을 사용한다.
		String a = "Hello Java";
		System.out.println(a.charAt(6)); // "J"출력
		// "Hello Java" 라는 문자열에서 "J"라는 문자는 일곱번째 문자이다. 하지만 6으로 문자를 찾아야 하는 이유는 자바는 숫자를 0부터 세기 때문이다.
		
		// replaceAll
		// replaceAll은 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용한다.
		// String a = "Hello Java";
		System.out.println(a.replaceAll("Java", "World")); // Hello World 출력
		// "Hello Java"라는 문자열에서 "Java"가 "World"로 바뀌었다.
		
		// substring
		// substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
		// 다음의 예를 보자.
		String a = "Hello Java";
		System.out.println(a.substring(0, 4)); // Hell 출력
		// 위처럼 substring(시작위치, 끝위치)와 같이 사용하면 문자열의 시작위치에서 끝위치까지의 문자를 뽑아내게 된다.
		// 단 끝위치는 포함이 안된다는 점에 주의하자.
		// 이것은 다음과 같은 수학의 식과 비슷하다.
		// 시작위치 <= a < 끝위치
		
		// toUpperCase
		// toUpparCase는 문자열을 모두 대문자로 변경할 때 사용한다. (모두 소문자로 변경할때는 toLowerCase를 사용한다.)
		String a = "Hello Java";
		System.out.println(a.toUpperCase()); // HELLO JAVA 출력
		
		// split
		// split 메소드는 문자열을 특정 구분자로 분리하는 메소드이다.
		String a = "a:b:c:d";
		String[] result = a.split(":"); // result는 {"a", "b", "c", "d"}
		// 위의 예처럼 "a:b:c:d"라는 문자열을 ":" 문자로 나누어 {"a", "b", "c", "d"} 문자열 배열을 만들 수 있다.
		

	}

}
