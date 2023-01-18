import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b10815 {
    static int[] nbox;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++){
            nbox[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(nbox);
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int ans=BinarySearch(Integer.parseInt(st.nextToken()));
            if(ans!=-1){
                System.out.println(1+" ");
            }else {
                System.out.println(0+" ");
            }
        }

    }
    private static int BinarySearch(int a){
        int left = 0;
        int right = nbox.length-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nbox[mid]<a) {
                left = mid + 1;
            }
            else if (nbox[mid]>a) {
                right=mid-1;
            }else return mid;
        }
        return -1;
    }
}
