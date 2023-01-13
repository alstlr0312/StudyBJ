import java.util.Arrays;
import java.util.Scanner;

public class b1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 666;
        int count = 1;
        while(count != num){
            a++;
            if(String.valueOf(a).contains("666")==true){
                count++;
            }
        }
        System.out.println(a);
    }
}
