package baekjoon;

import java.util.Scanner;

public class OX{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int total = 0;
        int streak = 0;
        String arr[] = new String[N];
        for(int i = 0; i < N; i++){
            arr[i] = scan.next();
            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    streak += 1;
                    total += streak;
                } else {
                    streak = 0;
                }
            }
            System.out.println(total);
            total = 0;
            streak = 0;
        }
        scan.close();
    }
}
