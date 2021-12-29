package boj.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2559 {
    static int N, K;
    static int[] a;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        a = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void solve() {
        int R = 0, sum = 0, ans = -100 * N;
        for (int L = 1; L + K - 1 <= N; L++) {
            sum -= a[L - 1];

            while (R + 1 <= L + K - 1) {
                R++;
                sum += a[R];
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}
