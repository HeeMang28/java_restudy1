package day2;

import java.util.Scanner;

public class Oven {
    public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
        
       int minTotal = a * 60 + b + c;
       int h = minTotal / 60;
       int minute = minTotal % 60;
        
        if(h >= 24){
            h= h - 24;
        }
        System.out.println(h + " " + minute);
    }
}
