import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class b24479 {
    static int[] seq;
    static ArrayList<Integer>[] graph;
    static int idx = 0;
    static boolean[] v;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        seq = new int[n+1];
        v = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        for (int i = 1; i <= n; i++){
            Collections.sort(graph[i]);
        }
        v[r] = true;
        dfs(r);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++){
            sb.append(seq[i]).append('\n');
        }
        System.out.print(sb);
    }
    private static void dfs(int root) {
        seq[root] = ++idx;
        for (int a : graph[root]) {
            if (v[a]) continue;
            v[a] = true;
            dfs(a);
        }
    }


}
