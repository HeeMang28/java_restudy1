package day5;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
}
public class sample1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name); //poppy 출력
		dog.sleep(); // poppy zzz출력
		// Animal dog = new Dog(); Dog is Animal
		// Dog dog = new Animal(); 컴파일 오류: 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
	}
}
