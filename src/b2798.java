import java.util.Arrays;
import java.util.Scanner;

public class b2798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int a = search(arr,n,m);
    }

    static int search(int[] arr, int n, int m){
        int a=0;
        for(int i=0; i<n-2;i++){
            for(int j=0; j<n-2; j++){
                for(int k=0; k<n-2; k++){
                    int card = arr[i]+arr[j]+arr[k];

                    if(m==card){
                        return card;
                    }

                    if(a<card&&card<m){
                        a=card;
                    }
                }
            }
        }
        return a;
    }

}
