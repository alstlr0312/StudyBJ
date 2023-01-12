import java.util.Arrays;
import java.util.Scanner;

public class b2447 {
    public static char[][] arr;
    public static void star(int n, int a, int b){
        if(n==1){
            arr[a][b] = '*';
            return;
        }
        int checkstar = n/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    continue;
                }else {
                    star(checkstar,a+(checkstar*i),b+(checkstar*j));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new char[n][n];

        for(int i=0; i<n; i++){
            Arrays.fill(arr[i],' ');
        }

        star(n,0,0);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
}