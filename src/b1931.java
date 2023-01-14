import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] I = new int[N][2];
        for(int i=0; i<N; i++){
            I[i][0] = sc.nextInt();
            I[i][1] = sc.nextInt();
        }
        Arrays.sort(I, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });
        int M=0;
        int Itime=0;
        for(int i=0; i<N; i++){
            if(Itime<=I[i][0]){
                Itime = I[i][1];
                M++;
            }
        }

        System.out.println(M);
    }
}
