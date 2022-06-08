package day5;

/*
	class Bouncer {
	    void barkAnimal(Animal animal) {
	        if (animal instanceof Tiger) {
	            System.out.println("어흥");
	        } else if (animal instanceof Lion) {
	            System.out.println("으르렁");
	        } else if (animal instanceof Crocodile) {
          System.out.println("쩝쩝");
        } else if (animal instanceof Leopard) {
          System.out.println("캬옹");
        }
	    }
	} <- 안좋은 구문이고 밑에 구문을 이용하면 좋다.
	    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable을 사용
        animal.bark();
    }

	public class sample7 {
	    public static void main(String[] args) {
	        Tiger tiger = new Tiger();
	        Lion lion = new Lion();

	        Bouncer bouncer= new Bouncer();
	        bouncer.barkAnimal(tiger);
	        bouncer.barkAnimal(lion);
	        
	     Tiger tiger = new Tiger();  // Tiger is a Tiger
		Animal animal = new Tiger();  // Tiger is a Animal
		Predator predator = new Tiger();  // Tiger is a Predator
		Barkable barkable = new Tiger();  // Tiger is a Barkable
		여러 가지 형태로 표현 가능한 Tiger 클래스의 객체
	    }
	} 
} */
