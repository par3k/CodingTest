package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15665 {
    private static int N, M;
    private static int[] arr;
    private static int[] tmp;

    private static void Recursive(int depth, StringBuilder sb){
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(tmp[i] + " ");
            }
            sb.append("\n");
            return;
        }
        int num = 0;
        for (int i = 0; i < N; i++) {
            if (num == arr[i]) continue;
            tmp[depth] = arr[i];
            Recursive(depth + 1, sb);
            num = arr[i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        tmp = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr);
        Recursive(0, sb);
        System.out.println(sb);
        br.close();
    }
}
