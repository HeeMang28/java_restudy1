package day7;

class Singleton {
    private Singleton() {
    }

public static Singleton getInstance() {
    return new Singleton();  // 같은 클래스이므로 생성자 호출이 가능하다.
}
}

public class sample5 {
public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
} // 싱글톤이 아닌 싱글톤..?
}
