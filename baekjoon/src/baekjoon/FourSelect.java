package baekjoon;

import java.util.Scanner;

public class FourSelect {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        // 변수 x, y에 값 받기
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        scan.close();
        // 받은 변수를 토대로 사분면 판단
        if(x > 0){
            if(y > 0){
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if(y > 0){
            System.out.println("2");
            }
            else {
            System.out.println("3");
            }
        }
    }
}