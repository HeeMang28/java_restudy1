package day5;

interface Predator {
	String getFood();
}
interface Barkable {
    void bark();
}
interface BarkablePredator extends Predator, Barkable {
}

class Animal2 {
	String name;
    
    void setName(String name) {
    	this.name = name;
    }
}

class Tiger extends Animal2 implements Predator, Barkable {
	public String getFood() {
		return "apple";
	}
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator {
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("으르렁");
    }
}

class Crocodile extends Animal2 {
}

class Leopard extends Animal2 {
}

class ZooKeeper {
        void feed(Predator predator) {
            System.out.println("feed "+predator.getFood());
    }
}
 /* 변경 전
class Zookeeper {
	void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져 준다.
    	System.out.println("feed apple");
   }
    void feed(Lion lion) { // 사자가 오면 바나나를 던져준다.
    	System.out.println("feed banana");
   }
    public void feed(Crocodile crocodile) {
        System.out.println("feed strawberry");
    }

    public void feed(Leopard leopard) {
        System.out.println("feed orange");
    }
} */

/*public class sample6 {
	public static void main(String[] args) {
    Zookeeper zooKeeper = new Zookeeper();
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    zooKeeper.feed(tiger); // feed apple 출력
    zooKeeper.feed(lion); // feed banana 출력
  	}
 } */
