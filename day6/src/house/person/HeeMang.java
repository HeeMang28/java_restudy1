package house.person;

import house.HousePark;

public class HeeMang extends HousePark {  // HousePark을 상속했다.
    public static void main(String[] args) {
        HeeMang hm = new HeeMang();
        System.out.println(hm.lastname);  // 상속한 클래스의 protected 변수는 접근이 가능하다.
    }
}
